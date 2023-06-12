package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Beans.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT u FROM Product u WHERE u.id = ?1")
    public Product findProductById(long id);
    @Modifying
    @Query("select p from Product p where p.category.name like ?1 or p.name like ?1")
    public List<Product> searchProduct(String keyword);
    @Query("SELECT p FROM Product p WHERE p.name LIKE CONCAT('%', :name, '%') OR p.category.name LIKE CONCAT('%', :category, '%')")
    List<Product> findBySearchKey(String name, String category);

    @Query(" select u from Product u  where u.category.id_category = ?1")
    public List<Product> getListByCategory(long id_category);

    @Query(" select u from Product u " +
            "join Category c on c.id_category = u.category.id_category" +
            " where c.parent_id = ?1")
    public List<Product> getLstProductParentId(long parentId);

    @Query(" SELECT COUNT(p.id) FROM Product p " +
            "JOIN Category c on c.id_category = p.category.id_category \n" +
            "WHERE c.parent_id = ?1")
    public long countProductByID(long id);

    @Query("SELECT COUNT(p.id) FROM Product p where p.category.id_category =?1")
    public long countProductByIdCaregory(long id);

    @Query("select p from Product p where p.name like %?1% ")
    public List<Product> search(String keyword);

    @Query("select  o from Order o join ShippingInfo s on s.id = o.shippingInfo.id where o.id = ?1")
    public Order getOrderById(long id);

    Page<Product> findAll(Pageable pageable);
}


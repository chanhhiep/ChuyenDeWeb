package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Product;
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

}


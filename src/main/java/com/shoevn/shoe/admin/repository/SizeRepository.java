package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long> {
    @Query("SELECT u FROM Size u WHERE u.id = ?1")
    public Size findSizeById(long id);
    @Query("SELECT s FROM Size s where s.description LIKE CONCAT('%', :name, '%')")
    List<PaymentMethod> findBySearchKey(String name);
    @Query("select s from Size s " +
            "join Product p on p.id = s.product.id" +
            " where  s.id = ?1")
    public Size getSizeByProduct(long id);

    @Query("select s from Size s " +
            "join Product p on p.id = s.product.id" +
            " where  p.id = ?1")
    public List<Size> getAllSizeById(long id);
}

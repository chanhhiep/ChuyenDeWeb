package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT u FROM Product u WHERE u.id = ?1")
    public Product findProductById(long id);
}


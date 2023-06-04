package com.shoevn.shoe.client.repository;

import com.shoevn.shoe.Beans.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    @Query("select  c from Cart c where  c.user.id =?1")
    public List<Cart> findByUser(long id);
}

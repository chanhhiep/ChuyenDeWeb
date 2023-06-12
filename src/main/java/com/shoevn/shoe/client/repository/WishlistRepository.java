package com.shoevn.shoe.client.repository;

import com.shoevn.shoe.Beans.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist,Long> {
    @Query("select  c from Wishlist c where  c.user.id =?1")
    public List<Wishlist> findByUser(long id);
}
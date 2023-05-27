package com.shoevn.shoe.admin.repository;


import com.shoevn.shoe.Beans.DiscountCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountCodeRepository extends JpaRepository<DiscountCode,Long> {
    @Query("SELECT u FROM DiscountCode u WHERE u.id = ?1")
    public DiscountCode findDiscountById(long id);
    @Modifying
    @Query("select b from DiscountCode b where b.name like ?1")
    public List<DiscountCode> searchDiscount(String keyword);
}

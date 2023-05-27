package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long> {
    @Query("SELECT u FROM Size u WHERE u.id = ?1")
    public Size findSizeById(long id);
}

package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
    @Query("SELECT u FROM Brand u WHERE u.id = ?1")
    public Brand findBrandById(long id);
}

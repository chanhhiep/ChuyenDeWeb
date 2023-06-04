package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {
    @Query("SELECT u FROM Brand u WHERE u.id = ?1")
    public Brand findBrandById(long id);
    @Modifying
    @Query("select b from Brand b where b.name like ?1")
    public List<Brand> searchBrand(String keyword);
    @Query("SELECT b FROM Brand b WHERE b.name LIKE CONCAT('%', :name, '%')")
    List<Brand> findBySearchKey(String name);
}

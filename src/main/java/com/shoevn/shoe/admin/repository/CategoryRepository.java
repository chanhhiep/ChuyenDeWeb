package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT u FROM Category u WHERE u.id_category = ?1")
    public Category findCategoryById(long id);
    @Modifying
    @Query("select c from Category c where c.name like ?1")
    public List<Category> searchCategory(String keyword);
}

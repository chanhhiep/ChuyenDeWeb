package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Account;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query("SELECT u FROM Category u WHERE u.id_category = ?1")
    public Category findCategoryById(long id);
}

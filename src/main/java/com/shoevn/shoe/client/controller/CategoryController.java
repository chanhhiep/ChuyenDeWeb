package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Service.CategoryService;
import com.shoevn.shoe.admin.repository.CategoryRepository;
import com.shoevn.shoe.dtos.request.CategoryRequest;
import com.shoevn.shoe.dtos.request.UpdateCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/category/create")
    public ResponseEntity<?> createCategory(@Valid @RequestBody CategoryRequest request) {
        return ResponseEntity.ok(categoryService.createCategory(request));

    }

    @PostMapping("/category/update")
    public ResponseEntity<?> updateCategory(@Valid @RequestBody UpdateCategoryRequest request) {
        return ResponseEntity.ok(categoryService.updateCategory(request));

    }

    @DeleteMapping("/category/delete/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable(value = "id") Long idCategory) {
        return ResponseEntity.ok(categoryService.deleteCategory(idCategory));
    }

    @GetMapping("category/getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(categoryService.getAll());
    }
    @GetMapping("/category/{categoryId}")
    public ResponseEntity<?> getCategoryById(@PathVariable(value = "categoryId") Long categoryId){
        return ResponseEntity.ok(categoryService.findByCategoryId(categoryId));
    }
    @GetMapping("/category/{parentId}")
    public ResponseEntity<?> getCategoryByParent(@PathVariable(value = "parentId") Integer parentId){
        return ResponseEntity.ok(categoryService.findByParentId(parentId));
    }
}

package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.service.CategoryAdminService;
import com.shoevn.shoe.admin.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryAdminController {

    @Autowired
    private CategoryAdminService categoryService;
    private static final String PATH = "/admin/category";

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<Category> listCategory(){
        List<Category> listCategory = categoryService.listAllCategory();
        return listCategory;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/showCategory/{id}")
    public Category showCategory(@PathVariable(name = "id") String id) {
        Long categoryId = Long.parseLong(id);
        Category category = categoryService.getCategoryById(categoryId);
        return category;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = PATH+"/saveCategory",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String saveCategory(@RequestParam("category") String category, @RequestParam("images") MultipartFile images ){
        categoryService.uploadCategory(category,images);
        return "redirect:/admin/category";
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping (value=PATH+"/deleteCategory/{id}")
    public ResponseEntity DeleteCategory(@PathVariable(name = "id") String id){
        try {
            Long categoryId = Long.parseLong(id);
            categoryService.deleteCategory(categoryId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PutMapping(value=PATH+"/updateCategory")
    public ResponseEntity UpdateCategory(@RequestBody CategoryDto category){
        try {
            categoryService.updateCategory(category);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/search")
    public List<Category> search(@RequestBody SearchDto keyword){
        System.out.println(keyword);
        List<Category> categories = categoryService.getCategoryByKeyword(keyword);
        System.out.println(categories);
        return categories;
    }
}

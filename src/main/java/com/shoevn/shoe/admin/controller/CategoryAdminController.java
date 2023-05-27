package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.service.CategoryAdminService;
import com.shoevn.shoe.admin.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryAdminController {

    @Autowired
    private CategoryAdminService categoryService;

    @GetMapping("/admin/category")
    public String listCategory(ModelMap model){
        List<Category> listCategory = categoryService.listAllCategory();
        if(listCategory!=null && listCategory.size()!=0) {
            model.put("categoryList",listCategory);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/category";
    }
    @GetMapping("/category/showCategory")
    public ResponseEntity<Category> showCategory(@RequestParam("id") String id) {
        Long categoryId = Long.parseLong(id);
        Category category = categoryService.getCategoryById(categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }
    @PostMapping(value = "/category/saveCategory")
    public String saveCategory(@ModelAttribute("dataForm") CategoryDto dataForm , @RequestParam("images") MultipartFile images ){
        categoryService.uploadCategory(dataForm,images);
        return "redirect:/admin/category";
    }

    @PostMapping(value="/category/deleteCategory")
    public ResponseEntity<?> DeleteCategory(@RequestParam("id") String id){
        try {
            Long categoryId = Long.parseLong(id);
            categoryService.deleteCategory(categoryId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/category/updateCategory")
    public ResponseEntity<?> UpdateProduct(@ModelAttribute("dataForm") CategoryDto category){
        try {
            categoryService.updateCategory(category);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/category/search")
    public String search(@RequestParam("keyword") String keyword, ModelMap model){
        System.out.println(keyword);
        List<Category> categories = categoryService.geCategoryByKeyword(keyword);
        System.out.println(categories);
        if(categories !=null && categories.size()!=0) {
            model.put("categoryList",categories);
        }
        else{
            System.out.println("empty search");
            model.put("categoryList",null);
        }

        return "/admin/category";
    }
}

package com.shoevn.shoe.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @GetMapping("/category")
    public String listProduct(ModelMap model){
        return "/admin/interfaces/category";
    }
}

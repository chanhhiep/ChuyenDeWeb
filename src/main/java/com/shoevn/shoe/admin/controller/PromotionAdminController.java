package com.shoevn.shoe.admin.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class PromotionAdminController {
    @GetMapping("/promotion")
    public String listProduct(ModelMap model){
        return "/admin/promotion";
    }
}

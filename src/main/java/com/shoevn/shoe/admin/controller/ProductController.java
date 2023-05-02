package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("product")
    public String listProduct(ModelMap model){
        List<Product> listProduct = productService.getAllProduct();

        if(listProduct !=null && listProduct .size()!=0) {
            model.put("productList", listProduct);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/product";
    }
    @GetMapping("/product/{id}")
    public String showProduct(@PathVariable String id, ModelMap model) {
        Long productId = Long.parseLong(id);
        Product product = productService.getProductById(productId);
        model.put("showProduct", product);
        return "/admin/product";
    }
}

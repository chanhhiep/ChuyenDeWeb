package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.service.CategoryService;
import com.shoevn.shoe.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("product")
    public String listProduct(ModelMap model){
        List<Product> listProduct = productService.getAllProduct();
        List<Category> listCategory = categoryService.listAllCategory();

        if(listProduct !=null && listProduct .size()!=0) {
            model.put("productList", listProduct);
            model.put("categoryList",listCategory);
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
    @PostMapping("/product/saveProduct")
    public String tourRegister(@ModelAttribute("dataForm") ProductDto dataForm, Model model) {
        System.out.println(dataForm.toString());
        long category_id = Long.parseLong(dataForm.getCategory_id());
        Category category = categoryService.getCategoryById(category_id);
        byte[] bytes = new byte[50000];
        Image image = new Image(dataForm.getImages(),"",bytes);
        List<Image> imageList =new ArrayList<>();
        imageList.add(image);
        Brand brand = new Brand();
        List< Size > sizes = new ArrayList<>();
        Product product = new Product(category, dataForm.getName(), Double.parseDouble(dataForm.getPrice()),Double.parseDouble(dataForm.getDiscountRate()),imageList,dataForm.getDescription(), brand,sizes, Integer.parseInt(dataForm.getQuantity()));
        productService.saveProduct(product);
        return "/admin/product";
    }
    public Set<Image> uploadImage(MultipartFile[] multipartFiles) throws IOException {
        Set<Image> imageModels = new HashSet<>();
        for (MultipartFile file : multipartFiles) {
            Image imageModel = new Image(
                    file.getOriginalFilename(),
                    file.getContentType(),
                    file.getBytes()
            );
            imageModels.add(imageModel);
        }
        return imageModels;
    }
}

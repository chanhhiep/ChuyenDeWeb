package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.service.CategoryAdminService;
import com.shoevn.shoe.admin.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@Controller
public class ProductAdminController {
    @Autowired
    private ProductAdminService productService;

    @Autowired
    private CategoryAdminService categoryService;

    @GetMapping("product")
    public String listProduct(ModelMap model){
        List<Product> listProduct = productService.getAllProduct();
        List<Category> listCategory = categoryService.listAllCategory();
        List<Size> listSize = productService.getAllSize();
        List<Brand> listBrand = productService.getAllBrands();
        if(listProduct !=null && listProduct .size()!=0) {
            model.put("productList", listProduct);
        }
        else{
            System.out.println("empty");
        }
        model.put("categoryList",listCategory);
        model.put("sizeList",listSize);
        model.put("brandList",listBrand);
        return "/admin/product";
    }
    @GetMapping("/product/{id}")
    public String showProduct(@PathVariable String id, ModelMap model) {
        Long productId = Long.parseLong(id);
        Product product = productService.getProductById(productId);
        model.put("showProduct", product);
        return "/admin/product";
    }
    @PostMapping(value = "/product/saveProduct")
    public String saveProduct(@ModelAttribute("dataForm") ProductDto dataForm , @RequestParam("images") MultipartFile images ) throws IOException {
        /*System.out.println(dataForm.toString());
        long category_id = Long.parseLong(dataForm.getCategory_id());
        Category category = categoryService.getCategoryById(category_id);
        List<Image> imageList = uploadImage(dataForm.getImages());
        Brand brand = new Brand();
        List< Size > sizes = new ArrayList<>();
        Product product = new Product(category, dataForm.getName(), Double.parseDouble(dataForm.getPrice()),Double.parseDouble(dataForm.getDiscountRate()),imageList,dataForm.getDescription(), brand,sizes, Integer.parseInt(dataForm.getQuantity()));
        productService.saveProduct(product);*/
        //dataForm.setImages(images);

        productService.uploadProduct(dataForm,images);
        return "/admin/product";
    }
    public List<Image> uploadImage(MultipartFile[] multipartFiles) throws IOException {
        List<Image> imageModels = new ArrayList<>();
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
    public String DeleteProduct(@PathVariable String id, ModelMap mode){
        return "/admin/product";
    }
    public String EditProduct(@PathVariable String id, ModelMap mode){
        return "/admin/product";
    }
}

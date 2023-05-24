package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.service.CategoryAdminService;
import com.shoevn.shoe.admin.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/product/showProduct")
    public ResponseEntity<Product> showProduct(@RequestParam("id") String id) {
        Long productId = Long.parseLong(id);
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
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
    @PostMapping(value="/product/deleteProduct")
    public ResponseEntity<?> DeleteProduct(@RequestParam("id") String id){
        try {
            Long productId = Long.parseLong(id);
            productService.deleteProduct(productId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/product/updateProduct")
    public String UpdateProduct(@ModelAttribute("dataForm") ProductDto product){
        productService.updateProduct(product);
        return "/admin/product";
    }
    @PostMapping(value="/product/search")
    public String search(@RequestParam("searchTerm") String searchTerm, ModelMap model){
        List<Product> products = productService.getProductByTitle(searchTerm);
        model.put("productList", products);
        return "/admin/product";
    }
}

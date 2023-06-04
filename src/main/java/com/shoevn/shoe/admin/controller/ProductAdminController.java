package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.service.CategoryAdminService;
import com.shoevn.shoe.admin.service.ProductAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

@RestController
public class ProductAdminController {
    @Autowired
    private ProductAdminService productService;

    @Autowired
    private CategoryAdminService categoryService;
    private static final String PATH = "/admin/product";

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<Product> listProduct(){
        List<Product> listProduct = productService.getAllProduct();
//        List<Category> listCategory = categoryService.listAllCategory();
//        List<Size> listSize = productService.getAllSize();
//        List<Brand> listBrand = productService.getAllBrands();
//        model.put("categoryList",listCategory);
//        model.put("sizeList",listSize);
//        model.put("brandList",listBrand);
        return listProduct;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/showProduct/{id}")
    public Product showProduct(@PathVariable(name = "id") String id) {
        Long productId = Long.parseLong(id);
        Product product = productService.getProductById(productId);
        return product;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = PATH+"/saveProduct",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveProduct(@RequestParam("product") String product,@RequestParam(value = "images",required = false) MultipartFile images ){
        /*System.out.println(dataForm.toString());
        long category_id = Long.parseLong(dataForm.getCategory_id());
        Category category = categoryService.getCategoryById(category_id);
        List<Image> imageList = uploadImage(dataForm.getImages());
        Brand brand = new Brand();
        List< Size > sizes = new ArrayList<>();
        Product product = new Product(category, dataForm.getName(), Double.parseDouble(dataForm.getPrice()),Double.parseDouble(dataForm.getDiscountRate()),imageList,dataForm.getDescription(), brand,sizes, Integer.parseInt(dataForm.getQuantity()));
        productService.saveProduct(product);*/
        //dataForm.setImages(images);
        /*
        try {
            productService.uploadProduct(dataForm,images);
            //productService.uploadProduct(dataForm);
            System.out.println("save success");
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        */
          productService.uploadProduct(product, images);
          System.out.println("save success");
          return ResponseEntity.ok().build();
    }
    /*
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
    }*/
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value=PATH+"/deleteProduct/{id}")
    public ResponseEntity DeleteProduct(@PathVariable(name = "id") String id){
        try {
            Long productId = Long.parseLong(id);
            productService.deleteProduct(productId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value=PATH+"/updateProduct")
    public ResponseEntity UpdateProduct(@RequestBody ProductDto product){
        try {
            productService.updateProduct(product);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/search")
    public List<Product> search(@RequestBody SearchDto keyword){
        System.out.println(keyword);
        List<Product> products = productService.getProductByKeywords(keyword);
        System.out.println(products);
        return products;
    }
}

package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Service.ProductService;
import com.shoevn.shoe.Service.SizeService;
import com.shoevn.shoe.dtos.auth.ProductDTO;
import com.shoevn.shoe.dtos.auth.SearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private SizeService sizeService;

    @PostMapping("/product/create")
    public Product createProduct(@RequestBody @Valid ProductDTO dto){
        return productService.createProduct(dto);
    }

    //@CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/product")
    public ResponseEntity<?> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/product/category/{categoryId}")
    public ResponseEntity<?> productByCategory(@PathVariable(value = "categoryId") Long categoryId){
        return ResponseEntity.ok(productService.getListByCategory(categoryId));
    }

    @GetMapping("/product/category/parent/{parentId}")
    public ResponseEntity<?> productByParent(@PathVariable(value = "parentId") Long parentId){
        return ResponseEntity.ok(productService.getLstProductParentId(parentId));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/product/search")
    public ResponseEntity<?> search(@RequestBody SearchDto key){
        return ResponseEntity.ok(productService.search(key));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/products/{productId}")
    public ResponseEntity<?> info(@PathVariable(value = "productId") long productId){
        return ResponseEntity.ok(sizeService.getInfoProduct(productId));
    }

    @GetMapping("/product/page")
    public ResponseEntity<?> getAllPageArticle(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(productService.getAllProductPage(page,size));
    }
}

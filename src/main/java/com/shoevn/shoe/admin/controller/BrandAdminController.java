package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.admin.dto.BrandDto;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.dto.PaymentMethodDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.repository.BrandRepository;
import com.shoevn.shoe.admin.service.BrandAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class BrandAdminController {
    @Autowired
    private BrandAdminService brandService;
    private static final String PATH = "/admin/brand";
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<Brand> listBrand(){
        List<Brand> listBrand = brandService.listAllBrand();
        return listBrand;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/showBrand/{id}")
    public Brand showBrand(@PathVariable(name = "id") String id) {
        Long brandId = Long.parseLong(id);
        Brand brand = brandService.getBrandById(brandId);
        return brand;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = PATH+"/saveBrand")
    public ResponseEntity saveBrand(@RequestBody BrandDto brand){
        try {
            brandService.uploadBrand(brand);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value=PATH+"/deleteBrand")
    public ResponseEntity<?> DeleteBrand(@PathVariable(name = "id") String id){
        try {
            Long brandId = Long.parseLong(id);
            brandService.deleteBrand(brandId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value=PATH+"/updateBrand")
    public ResponseEntity<?> UpdateBrand(@RequestBody BrandDto brand){
        try {
            brandService.updateBrand(brand);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value=PATH+"/search")
    public List<Brand> search(@RequestBody SearchDto keyword){
        System.out.println(keyword);
        List<Brand> brands = brandService.getBrandByKeyword(keyword);
        System.out.println(brands);
        return brands;
    }
}

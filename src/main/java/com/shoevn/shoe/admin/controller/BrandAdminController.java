package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.admin.dto.BrandDto;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.repository.BrandRepository;
import com.shoevn.shoe.admin.service.BrandAdminService;
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
import java.util.List;

@Controller
public class BrandAdminController {
    @Autowired
    private BrandAdminService brandService;
    @GetMapping("/admin/brand")
    public String listBrand(ModelMap model){
        List<Brand> listBrand = brandService.listAllBrand();
        if(listBrand!=null && listBrand.size()!=0) {
            model.put("brandList",listBrand);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/brand";
    }
    @GetMapping("/brand/showBrand")
    public ResponseEntity<Brand> showBrand(@RequestParam("id") String id) {
        Long brandId = Long.parseLong(id);
        Brand brand = brandService.getBrandById(brandId);
        return new ResponseEntity<>(brand, HttpStatus.OK);
    }
    @PostMapping(value = "/brand/saveBrand")
    public String saveBrand(@ModelAttribute("dataForm") BrandDto dataForm){
        brandService.uploadBrand(dataForm);
        return "redirect:/admin/brand";
    }
    @PostMapping(value="/brand/deleteBrand")
    public ResponseEntity<?> DeleteBrand(@RequestParam("id") String id){
        try {
            Long brandId = Long.parseLong(id);
            brandService.deleteBrand(brandId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/brand/updateBrand")
    public ResponseEntity<?> UpdateBrand(@ModelAttribute("dataForm") BrandDto brand){
        try {
            brandService.updateBrand(brand);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/brand/search")
    public String search(@RequestParam("keyword") String keyword, ModelMap model){
        System.out.println(keyword);
        List<Brand> brands = brandService.getBrandByKeyword(keyword);
        System.out.println(brands);
        if(brands !=null && brands.size()!=0) {
            model.put("brandList",brands);
        }
        else{
            System.out.println("empty search");
            model.put("brandList",null);
        }

        return "/admin/brand";
    }
}

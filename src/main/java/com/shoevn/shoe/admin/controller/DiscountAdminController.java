package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.DiscountCode;
import com.shoevn.shoe.admin.dto.BrandDto;
import com.shoevn.shoe.admin.dto.DiscountDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.service.DiscountAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiscountAdminController {

    @Autowired
    private DiscountAdminService discountService;
    private static final String PATH = "/admin/discount";

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<DiscountCode> listDiscount(ModelMap model){
        List<DiscountCode> listDiscount = discountService.listAllDiscount();
        return listDiscount;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/showDiscount/{id}")
    public DiscountCode showDiscount(@PathVariable(name = "id") String id) {
        Long discountId = Long.parseLong(id);
        DiscountCode discount = discountService.getDiscountById(discountId);
        return discount;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = PATH+"/saveDiscount")
    public ResponseEntity saveDiscount(@RequestBody DiscountDto discountDto){
        try {
            discountService.uploadDiscount(discountDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value=PATH+"/deleteDiscount")
    public ResponseEntity<?> deleteDiscount(@PathVariable(name = "id") String id){
        try {
            Long discountId = Long.parseLong(id);
            discountService.deleteDiscount(discountId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value=PATH+"/updateDiscount")
    public ResponseEntity<?> UpdateDiscount(@RequestBody DiscountDto discountDto){
        try {
            discountService.updateDiscount(discountDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/search")
    public List<DiscountCode> search(@RequestBody SearchDto keyword){
        System.out.println(keyword);
        List<DiscountCode> discounts = discountService.getDiscountByKeyword(keyword);
        System.out.println(discounts);
        return discounts;
    }
}

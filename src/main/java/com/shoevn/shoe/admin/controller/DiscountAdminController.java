package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.DiscountCode;
import com.shoevn.shoe.admin.dto.DiscountDto;
import com.shoevn.shoe.admin.service.DiscountAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DiscountAdminController {
    @Autowired
    private DiscountAdminService discountService;
    @GetMapping("/admin/discount")
    public String listDiscount(ModelMap model){
        List<DiscountCode> listDiscount = discountService.listAllDiscount();
        if(listDiscount!=null && listDiscount.size()!=0) {
            model.put("discountList",listDiscount);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/discount";
    }
    @GetMapping("/discount/showDiscount")
    public ResponseEntity<DiscountCode> showDiscount(@RequestParam("id") String id) {
        Long discountId = Long.parseLong(id);
        DiscountCode discount = discountService.getDiscountById(discountId);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
    @PostMapping(value = "/discount/saveDiscount")
    public String saveDiscount(@ModelAttribute("dataForm") DiscountDto dataForm){
        discountService.uploadDiscount(dataForm);
        return "redirect:/admin/discount";
    }
    @PostMapping(value="/discount/deleteDiscount")
    public ResponseEntity<?> deleteDiscount(@RequestParam("id") String id){
        try {
            Long discountId = Long.parseLong(id);
            discountService.deleteDiscount(discountId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/discount/updateDiscount")
    public ResponseEntity<?> UpdateDiscount(@ModelAttribute("dataForm") DiscountDto discount){
        try {
            discountService.updateDiscount(discount);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/discount/search")
    public String search(@RequestParam("keyword") String keyword, ModelMap model){
        System.out.println(keyword);
        List<DiscountCode> discounts = discountService.getDiscountByKeyword(keyword);
        System.out.println(discounts);
        if(discounts !=null && discounts.size()!=0) {
            model.put("discountList",discounts);
        }
        else{
            System.out.println("empty search");
            model.put("discountList",null);
        }

        return "/admin/discount";
    }
}

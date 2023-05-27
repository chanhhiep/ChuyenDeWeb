package com.shoevn.shoe.admin.controller;


import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.admin.dto.PaymentMethodDto;
import com.shoevn.shoe.admin.service.PaymentMethodAdminService;
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
public class PaymentAdminController {

    @Autowired
    private PaymentMethodAdminService paymentService;

    @GetMapping("/admin/payment")
    public String listPayment(ModelMap model){
        List<PaymentMethod> listPayment = paymentService.listAllPaymentMethod();
        if(listPayment!=null && listPayment.size()!=0) {
            model.put("paymentList",listPayment);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/payment";
    }
    @GetMapping("/payment/showPayment")
    public ResponseEntity<PaymentMethod> showpayment(@RequestParam("id") String id) {
        Long paymentId = Long.parseLong(id);
        PaymentMethod payment = paymentService.getPaymentMethodById(paymentId);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }
    @PostMapping(value = "/payment/savePayment")
    public String savePayment(@ModelAttribute("dataForm") PaymentMethodDto dataForm){
        paymentService.uploadPaymentMethod(dataForm);
        return "redirect:/admin/payment";
    }
    @PostMapping(value="/payment/deletePayment")
    public ResponseEntity<?> deletePayment(@RequestParam("id") String id){
        try {
            Long paymentId = Long.parseLong(id);
            paymentService.deletePaymentMethod(paymentId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/payment/updatePayment")
    public ResponseEntity<?> UpdatePayment(@ModelAttribute("dataForm") PaymentMethodDto payment){
        try {
            paymentService.updatePaymentMethod(payment);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/payment/search")
    public String search(@RequestParam("keyword") String keyword, ModelMap model){
        System.out.println(keyword);
        List<PaymentMethod> payments = paymentService.getPaymentMethodByKeyword(keyword);
        System.out.println(payments);
        if(payments !=null && payments.size()!=0) {
            model.put("paymentList",payments);
        }
        else{
            System.out.println("empty search");
            model.put("paymentList",null);
        }
        return "/admin/payment";
    }
}

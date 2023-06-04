package com.shoevn.shoe.admin.controller;


import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.admin.dto.PaymentMethodDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.service.PaymentMethodAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentAdminController {

    @Autowired
    private PaymentMethodAdminService paymentService;
    private static final String PATH = "/admin/payment";

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<PaymentMethod> listPayment(){
        List<PaymentMethod> listPayment = paymentService.listAllPaymentMethod();
        return listPayment;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/payment/{id}")
    public PaymentMethod showPayment(@PathVariable(name = "id") String id) {
        Long paymentId = Long.parseLong(id);
        PaymentMethod payment = paymentService.getPaymentMethodById(paymentId);
        return payment;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value = PATH+"/savePayment")
    public ResponseEntity savePayment(@RequestBody PaymentMethodDto payment){
        try {
            paymentService.uploadPaymentMethod(payment);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value=PATH+"/deletePayment/{id}")
    public ResponseEntity deletePayment(@PathVariable(name = "id") String id){
        try {
            Long paymentId = Long.parseLong(id);
            paymentService.deletePaymentMethod(paymentId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value=PATH+"/updatePayment")
    public ResponseEntity UpdatePayment(@RequestBody PaymentMethodDto payment){
        try {
            paymentService.updatePaymentMethod(payment);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/payment/search")
    public List<PaymentMethod> search(@RequestBody SearchDto keyword){
        System.out.println(keyword);
        List<PaymentMethod> payments = paymentService.getPaymentMethodByKeyword(keyword);
        System.out.println(payments);
        return payments;
    }
}

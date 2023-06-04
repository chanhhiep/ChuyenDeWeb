package com.shoevn.shoe.client.controller;


import com.shoevn.shoe.Service.PaymentService;
import com.shoevn.shoe.dtos.request.PaymentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/payment/create")
    public ResponseEntity<?> createPayment(@Valid @RequestBody PaymentRequest request){
        return ResponseEntity.ok(service.createPayment(request));
    }
    @DeleteMapping("/payment/delete/{id}")
    public ResponseEntity<?> deletePayment(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.deletePayment(id));
    }
}

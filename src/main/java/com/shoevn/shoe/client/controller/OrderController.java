package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Service.OrderService;
import com.shoevn.shoe.dtos.auth.OrderDTO;
import com.shoevn.shoe.dtos.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/create")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest request, @RequestParam("email") String email){
        return ResponseEntity.ok(orderService.createOrder(request,email));
    }

    @GetMapping("/order/user/{userId}")
    public ResponseEntity<?> getAllOrderByUser(@PathVariable(value = "userId") Long userId){
        return ResponseEntity.ok(orderService.getAllOrderByUser(userId));
    }
}

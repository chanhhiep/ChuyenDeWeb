package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Service.OrderService;
import com.shoevn.shoe.dtos.auth.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/create")
    public Order createOrder(@RequestBody @Valid OrderDTO dto){
        return orderService.createOrder(dto);
    }
}

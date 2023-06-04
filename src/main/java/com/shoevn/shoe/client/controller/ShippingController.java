package com.shoevn.shoe.client.controller;


import com.shoevn.shoe.Service.ShippingService;
import com.shoevn.shoe.dtos.request.ShipRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ShippingController {
    @Autowired
    private ShippingService service;

    @PostMapping("/shipping/create")
    public ResponseEntity<?> createShip(@Valid @RequestBody ShipRequest request){
        return ResponseEntity.ok(service.createShipping(request));
    }
}

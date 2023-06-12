package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Service.SizeService;
import com.shoevn.shoe.dtos.request.SizeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class SizeController {
    @Autowired
    private SizeService service;

    @PostMapping("/size/create")
//    public Size createSize(@RequestBody @Valid SizeDTO dto){
//        return service.createSize(dto);
//    }
    public ResponseEntity<?> createSize(@Valid @RequestBody SizeRequest request){
        return ResponseEntity.ok(service.create(request));
    }
    @GetMapping("/size/getAll")
    public  ResponseEntity<?> getAllSize(){
        return ResponseEntity.ok(service.getAll());
    }
}

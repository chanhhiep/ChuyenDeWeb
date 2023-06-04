package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Service.ReviewService;
import com.shoevn.shoe.dtos.request.ReviewRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class ReviewController {
    @Autowired
    ReviewService service;
    @PostMapping(value = {"/comment/create"})
    public ResponseEntity<?> createComment(@RequestAttribute("email") String email, @RequestBody ReviewRequest request){
        return  ResponseEntity.ok(service.creatReview(email,request));
    }
}

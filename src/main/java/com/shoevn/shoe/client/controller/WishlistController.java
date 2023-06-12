package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.Beans.Wishlist;
import com.shoevn.shoe.Service.WishlistService;
import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class WishlistController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WishlistService service;

    public ResponseEntity<?> addToWishlist(@PathVariable("productId") Long productId, @RequestAttribute("email")String email){
        return ResponseEntity.ok(service.addWishlist(productId,email));
    }

    @DeleteMapping ("/wishlist/{id}/remove")
    public void removeToWishlist(@PathVariable("id") long id) {
        service.removeWishlist(id);
    }

    @GetMapping("/wishlist/{userId}/getAll")
    public ResponseEntity<?> getAll(@PathVariable(value = "userId") long userId){
        return ResponseEntity.ok(service.getAllProToWishlist(userId));
    }
}
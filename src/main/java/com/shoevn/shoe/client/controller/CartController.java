package com.shoevn.shoe.client.controller;

import com.shoevn.shoe.Service.CartService;
import com.shoevn.shoe.Service.ProductService;
import com.shoevn.shoe.Service.UserService;
import com.shoevn.shoe.dtos.request.CartRequest;
import com.shoevn.shoe.dtos.request.UpdateCartRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class CartController {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartService cartService;

    @PostMapping(value = {"/add/product"})
    public ResponseEntity<?> addCart(@RequestParam("id") String productId,@RequestParam("email") String email
            ,@RequestBody CartRequest request) {

        return ResponseEntity.ok(cartService.addCart(Long.parseLong(productId),email,request));
    }

    @DeleteMapping("cart/remove/{cartId}")
//    public ResponseEntity<?> removeCart(@PathVariable(value = "cartId") long cartId){
//       return ResponseEntity.ok(cartService.removeCart(cartId));
//    }
    public void remove(@PathVariable(value = "cartId") long cartId){
        cartService.removeCart(cartId);
    }

    @GetMapping("/cart/{userId}")
    public ResponseEntity<?> getAllCartOfUser(@PathVariable(value = "userId") long userId){
        return ResponseEntity.ok(cartService.getAllProToCartByUser(userId));
    }
    @PutMapping("/cart/update")
    public ResponseEntity<?> updateCart(@Valid @RequestBody UpdateCartRequest request){
        return ResponseEntity.ok(cartService.updateCart(request));
    }
}

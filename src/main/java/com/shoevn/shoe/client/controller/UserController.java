package com.shoevn.shoe.client.controller;


import com.shoevn.shoe.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "users")
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/profile/{email}")
    @ApiOperation(value = "lấy thông tin user")
    public ResponseEntity<?> getProfile(@PathVariable( name = "email") String user) {
        return ResponseEntity.ok(userService.getProfile(user));
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }
}

package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Service.AuthenticationService;
import com.shoevn.shoe.dtos.auth.AuthenticationRequest;
import com.shoevn.shoe.dtos.auth.AuthenticationResponse;
import com.shoevn.shoe.dtos.auth.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AdminAuthenticatedController {

    private final AuthenticationService service;
    private static final String PATH = "/admin/";
    public AdminAuthenticatedController(AuthenticationService service) {
        this.service = service;
    }
    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody @Valid RegisterRequest request
    ) {
        return ResponseEntity.ok(service.registerAdmin(request));
    }
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}

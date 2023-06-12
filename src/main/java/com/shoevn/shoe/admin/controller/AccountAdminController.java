package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.Service.AuthenticationService;
import com.shoevn.shoe.admin.dto.AccountDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.service.AccountAdminService;
import com.shoevn.shoe.dtos.auth.AuthenticationResponse;
import com.shoevn.shoe.dtos.auth.RegisterRequest;
import com.shoevn.shoe.enums.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class AccountAdminController {
    private static final String PATH = "/admin/account";
    @Autowired
    AccountAdminService accountAdminService;

    private final AuthenticationService service;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/admin")
    public List<User> getAllAccountAdmin(){
        List<User> admin = accountAdminService.getAllUserByRole(Role.ADMIN);
        return admin;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/user")
    public List<User> getAllAccountUser(){
        List<User> admin = accountAdminService.getAllUserByRole(Role.USER);
        return admin;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH+"/showAccount/{id}")
    public User getAllAccountById(@PathVariable(name = "id") long id){
        User account = accountAdminService.getAccountById(id);
        return account;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(PATH+"/update")
    public ResponseEntity updateAccount(@RequestBody AccountDto accountDto){
        try {
            accountAdminService.updateUserByUserId(accountDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(PATH+"/delete/{id}")
    public ResponseEntity deleteAccount(@PathVariable(name = "id") long id){
        try {
            accountAdminService.deleteUser(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/search/user")
    public List<User> searchUser(@RequestBody SearchDto keyword){
        return accountAdminService.findAccountBySearchKey(keyword,Role.USER);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value=PATH+"/search/admin")
    public List<User> searchAdmin(@RequestBody SearchDto keyword){
        return accountAdminService.findAccountBySearchKey(keyword,Role.ADMIN);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(PATH+"/signup")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody @Valid RegisterRequest request
    ) {
        return ResponseEntity.ok(service.registerAdmin(request));
    }

}

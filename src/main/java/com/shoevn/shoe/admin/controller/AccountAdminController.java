package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.AccountDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.service.AccountAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class AccountAdminController {
    @Autowired
    private AccountAdminService accountAdminService;
    @GetMapping("/admin/account")
    public String listProduct(ModelMap model){
        List<Account> listAccount = accountAdminService.getAllAccount();
        if(listAccount !=null && listAccount.size()!=0) {
            model.put("accountList", listAccount);
        }
        else{
            System.out.println("empty");
        }
        return "/admin/account";
    }
    @GetMapping("/account/showAccount")
    public ResponseEntity<Account> showProduct(@RequestParam("id") String id) {
        Long accountId = Long.parseLong(id);
        Account account = accountAdminService.getAccountById(accountId);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
    @PostMapping(value = "/account/saveAccount")
    public String saveProduct(@ModelAttribute("dataForm") AccountDto dataForm ){
        accountAdminService.uploadAccount(dataForm);
        return "redirect:/admin/account";
    }
    @PostMapping(value="/account/deleteAccount")
    public ResponseEntity<?> DeleteAccount(@RequestParam("id") String id){
        try {
            Long accountId = Long.parseLong(id);
            accountAdminService.deleteAccount(accountId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/account/updateAccount")
    public ResponseEntity<?> UpdateAccount(@ModelAttribute("dataForm")AccountDto accountDto){
        try {
            accountAdminService.updateAccount(accountDto);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping(value="/account/search")
    public String search(@RequestParam("keyword") String keyword, ModelMap model){
        System.out.println(keyword);
        List<Account> accounts = accountAdminService.getAccountByKeyword(keyword);
        System.out.println(accounts);
        //model.put("productList", products);
        if(accounts !=null && accounts.size()!=0) {
            model.put("accountList", accounts);
        }
        else{
            System.out.println("empty search");
            model.put("accountList",null);
        }
        return "/admin/product";
    }
}

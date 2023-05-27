package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.AccountDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccountAdminService {
    @Autowired
    private AccountRepository accountRepository;
    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }
    public Account getAccountById(long id) {
        return accountRepository.findAccountById(id);
    }
    public void uploadAccount(AccountDto accountDto) {
        System.out.println(accountDto.toString());
        //Account account = accountRepository.findAccountById(Long.parseLong(accountDto.getId()));
        Date currentDate = new Date();
        Account account = Account.builder()
                .username(accountDto.getUsername())
                .password(accountDto.getPassword())
                .name(accountDto.getName())
                .email(accountDto.getEmail())
                .phone(accountDto.getPhone())
                .active(true)
                .user_role(accountDto.getRole())
                .build();
        accountRepository.save(account);
    }
    public void deleteAccount(long id){
        accountRepository.deleteById(id);
    }
    public void updateAccount(AccountDto accountDto){
        System.out.println(accountDto.toString());
        Long account_id = Long.parseLong(accountDto.getId());
        Account account = accountRepository.findAccountById(account_id);
        account.setUsername(accountDto.getUsername());
        account.setName(accountDto.getName());
        account.setPassword(accountDto.getPassword());
        account.setEmail(account.getEmail());
        account.setUser_role(accountDto.getRole());
        accountRepository.save(account);
    }
    public List<Account> getAccountByKeyword(String keyword){
        return accountRepository.searchAccount(keyword);
    }
}

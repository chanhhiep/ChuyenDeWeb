package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.admin.dto.AccountDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.enums.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountAdminService {
    @Autowired
    UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public List<User> getAllUserByRole(Role role){
        return userRepository.findAllUserByRole(role);
    }
    public void updateUserByUserId(AccountDto account){
        User user = userRepository.findUserById(Long.parseLong(account.getId()));
        user.setName(account.getName());
        //user.setPassword(passwordEncoder.encode(account.getPassword()));
        user.setPhone(account.getPhone());
        userRepository.save(user);
    }
    public void deleteUser(long userId){
        userRepository.deleteById(userId);
    }
    public List<User> findAccountBySearchKey(SearchDto keyword,Role role){
        return userRepository.findAccountBySearchKey(keyword.getKeywords(),keyword.getKeywords(),role);
    }
    public User getAccountById(long id){
        return userRepository.findUserById(id);
    }
}

package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.User;

import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.dtos.UserDto;
import com.shoevn.shoe.dtos.mappers.UserDTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDTOMapper userDTOMapper;


    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users.stream().map(userDTOMapper::apply).collect(Collectors.toList());
        return userDtos;
    }

    public User getProfile(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    public UserDto getUserById(Long id) {
        return userRepository.findById(id).map(userDTOMapper::apply).orElse(null);
    }
}

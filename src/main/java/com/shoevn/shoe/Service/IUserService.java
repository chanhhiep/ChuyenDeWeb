package com.shoevn.shoe.Service;

import com.shoevn.shoe.dtos.UserDto;

import java.util.List;

public interface IUserService {
        List<UserDto> getAll();
        UserDto getUserById(Long id);
}

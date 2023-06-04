package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserDTOMapper implements Function<User, UserDto> {
    @Override
    public UserDto apply(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail());
    }
}

package com.shoevn.shoe.dtos;

import com.shoevn.shoe.dtos.SizeDto;
import com.shoevn.shoe.dtos.UserDto;

public record CartDto(long id, SizeDto size, UserDto user, int quantity) {
}

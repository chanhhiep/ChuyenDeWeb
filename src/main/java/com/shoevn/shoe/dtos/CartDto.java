package com.shoevn.shoe.dtos;

import com.shoevn.shoe.dtos.SizeDto;
import com.shoevn.shoe.dtos.UserDto;

public record CartDto(long id,ProductDto product,UserDto user,int quantity,String size) {
}
package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.Cart;
import com.shoevn.shoe.dtos.CartDto;
import com.shoevn.shoe.dtos.ProductDto;
import com.shoevn.shoe.dtos.SizeDto;
import com.shoevn.shoe.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CartDtoMapper implements Function<Cart, CartDto> {
    @Autowired
    private  ProductDtoMapper productDtoMapper;
    @Autowired
    private UserDTOMapper userDTOMapper;
    @Override
    public CartDto apply(Cart cart) {
        ProductDto product =productDtoMapper.apply(cart.getProduct());
        UserDto user = userDTOMapper.apply(cart.getUser());
        return new CartDto(cart.getId(),product,user,cart.getQuantity(),cart.getSize());
    }
}

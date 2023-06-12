package com.shoevn.shoe.dtos.mappers;

import com.shoevn.shoe.Beans.Wishlist;
import com.shoevn.shoe.dtos.ProductDto;
import com.shoevn.shoe.dtos.UserDto;
import com.shoevn.shoe.dtos.WishlistDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class WishlistDtoMapper  implements Function<Wishlist, WishlistDto> {
    @Autowired
    private  ProductDtoMapper productDtoMapper;
    @Autowired
    private UserDTOMapper userDTOMapper;

    @Override
    public WishlistDto apply(Wishlist wishlist) {
        ProductDto product =productDtoMapper.apply(wishlist.getProduct());
        UserDto user = userDTOMapper.apply(wishlist.getUser());
        return new WishlistDto(wishlist.getId(),product,user);
    }
}

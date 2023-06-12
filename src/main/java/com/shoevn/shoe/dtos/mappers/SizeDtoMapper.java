package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.dtos.ProductDto;
import com.shoevn.shoe.dtos.SizeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class SizeDtoMapper implements Function<Size, SizeDto> {
    @Autowired
    private ProductDtoMapper productDtoMapper;
    @Override
    public SizeDto apply(Size size) {
        return new SizeDto(size.getId(),size.getSize_num());
    }
}

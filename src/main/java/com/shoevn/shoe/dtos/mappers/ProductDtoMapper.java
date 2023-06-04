package com.shoevn.shoe.dtos.mappers;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.dtos.CategoryDto;
import com.shoevn.shoe.dtos.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDtoMapper implements Function<Product, ProductDto> {
    @Autowired
    CategoryDtoMapper categoryDtoMapper;
    @Override
    public ProductDto apply(Product product) {
        CategoryDto categoryDto = categoryDtoMapper.apply(product.getCategory());

        return new ProductDto(product.getId(), product.getName(), categoryDto, product.getPrice(), product.getDiscountRate(), product.getImages(), product.getQuantity(),product.getListReview());
    }
}

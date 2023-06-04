package com.shoevn.shoe.dtos.mappers;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.dtos.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CategoryDtoMapper implements Function<Category, CategoryDto> {

    @Override
    public CategoryDto apply(Category category) {
        return new CategoryDto(category.getId_category(), category.getName(),category.getParent_id());
    }
}

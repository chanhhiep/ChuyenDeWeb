package com.shoevn.shoe.dtos;

import com.shoevn.shoe.Beans.Review;
import com.shoevn.shoe.dtos.CategoryDto;

import java.util.List;

public record ProductDto(Long id, String name, CategoryDto category, double price,
                         double rate, String img, Integer quantity, List<Review> listReview) {
}

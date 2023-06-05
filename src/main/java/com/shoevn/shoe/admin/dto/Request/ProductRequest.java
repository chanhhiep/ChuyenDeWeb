package com.shoevn.shoe.admin.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private long category_id;
    private double price;
    private double discountRate;
    private String description;
    private int quantity;
    private long brand;
}

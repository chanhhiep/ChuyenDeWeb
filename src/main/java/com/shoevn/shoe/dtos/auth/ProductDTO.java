package com.shoevn.shoe.dtos.auth;

import lombok.Data;

@Data
public class ProductDTO {
    private Long idCategory;
    private String name;
    private double price;
    private double discountRate;
    private String img;
    private int quantity;
}

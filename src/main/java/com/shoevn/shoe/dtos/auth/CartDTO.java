package com.shoevn.shoe.dtos.auth;


import lombok.Data;

@Data
public class CartDTO {
    private Long product;
    private Long user;
    private int quantity;
}

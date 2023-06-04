package com.shoevn.shoe.dtos.auth;


import lombok.Data;

@Data
public class CartDTO {
    private Long size;
    private Long user;
    private int quantity;
}

package com.shoevn.shoe.dtos.auth;

import lombok.Data;

@Data
public class OrderDetailDTO {
    private Long order;
    private Long size;
    private int quantity;
    private double price;
    private double total;
    private String note;
}

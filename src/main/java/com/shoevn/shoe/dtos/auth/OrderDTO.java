package com.shoevn.shoe.dtos.auth;

import lombok.Data;

@Data
public class OrderDTO {
    private Long shipping;
    private Long user;
    private Long payment;
    private String state;
    private String note;
    private double totalOrder;
}

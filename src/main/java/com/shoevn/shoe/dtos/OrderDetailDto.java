package com.shoevn.shoe.dtos;



public record OrderDetailDto(long id, OrderDto orderDto,ProductDto product,int quantity,int size,double total,String note) {
}
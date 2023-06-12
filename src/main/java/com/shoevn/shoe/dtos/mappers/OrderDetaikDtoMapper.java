package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.OrderDetail;
import com.shoevn.shoe.dtos.OrderDetailDto;
import com.shoevn.shoe.dtos.OrderDto;
import com.shoevn.shoe.dtos.ProductDto;
import com.shoevn.shoe.dtos.SizeDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderDetaikDtoMapper implements Function<OrderDetail, OrderDetailDto> {
    @Autowired
    private OrderDtoMapper orderDtoMapper;
    @Autowired
    private ProductDtoMapper productDtoMapper;
    @Override
    public OrderDetailDto apply(OrderDetail orderDetail) {
        OrderDto order = orderDtoMapper.apply(orderDetail.getOrder());
        ProductDto product = productDtoMapper.apply(orderDetail.getProduct());
        return new OrderDetailDto(orderDetail.getId(),order,product,orderDetail.getQuantity(),orderDetail.getSize(),orderDetail.getTotal(),orderDetail.getNote());
    }
}

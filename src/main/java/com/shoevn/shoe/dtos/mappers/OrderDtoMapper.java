package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.dtos.PaymentDto;
import com.shoevn.shoe.dtos.ShipDto;
import com.shoevn.shoe.dtos.UserDto;
import com.shoevn.shoe.dtos.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderDtoMapper implements Function<Order, OrderDto> {
    @Autowired
    private ShipDtoMapper shipDtoMapper;
    @Autowired
    private UserDTOMapper userDTOMapper;
    @Autowired
    private PaymentDtoMapper paymentDtoMapper;
    @Override
    public OrderDto apply(Order order) {
        ShipDto ship = shipDtoMapper.apply(order.getShippingInfo());
        UserDto user= userDTOMapper.apply(order.getAccount());
        PaymentDto payment = paymentDtoMapper.apply(order.getPaymentMethod());
        return new OrderDto(order.getId(),ship,user,payment,order.getState(),order.getNote());
    }
}

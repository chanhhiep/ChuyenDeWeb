package com.shoevn.shoe.dtos;

import com.shoevn.shoe.dtos.PaymentDto;
import com.shoevn.shoe.dtos.ShipDto;
import com.shoevn.shoe.dtos.UserDto;

public record OrderDto(long id, ShipDto shipDto, UserDto userDto,PaymentDto paymentId,String state,String note,double totalOrder) {
}
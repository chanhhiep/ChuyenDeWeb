package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.dtos.ShipDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ShipDtoMapper implements Function<ShippingInfo, ShipDto> {

    @Override
    public ShipDto apply(ShippingInfo shippingInfo) {
        return new ShipDto(shippingInfo.getId(),shippingInfo.getShippingEmail(),shippingInfo.getShippingName()
        ,shippingInfo.getShippingPhone(),shippingInfo.getShippingAddress(),shippingInfo.getWard(),shippingInfo.getDistrict(),shippingInfo.getProvince());
    }
}

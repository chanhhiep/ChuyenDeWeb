package com.shoevn.shoe.dtos.mappers;


import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.dtos.PaymentDto;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PaymentDtoMapper implements Function<PaymentMethod, PaymentDto> {
    @Override
    public PaymentDto apply(PaymentMethod p) {
        return new PaymentDto(p.getId(),p.getName(), p.getDescription());
    }
}

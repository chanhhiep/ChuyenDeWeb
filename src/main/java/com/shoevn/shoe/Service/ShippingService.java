package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.admin.repository.ShippingRepository;
import com.shoevn.shoe.dtos.ShipDto;
import com.shoevn.shoe.dtos.mappers.ShipDtoMapper;
import com.shoevn.shoe.dtos.request.ShipRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class ShippingService {
    @Autowired
    private ShippingRepository repository;
    @Autowired
    private ShipDtoMapper mapper;

    public ShipDto createShipping(@Valid ShipRequest request){
        ShippingInfo shippingInfo = ShippingInfo.builder()
                .shippingEmail(request.getEmail())
                .shippingName(request.getName())
                .shippingAddress(request.getAddress())
                .shippingPhone(request.getPhone())
                .ward(request.getXa())
                .district(request.getHuyen())
                .province(request.getTinh())
                .build();
        ShippingInfo save = repository.save(shippingInfo);
        return  mapper.apply(save);
    }
}

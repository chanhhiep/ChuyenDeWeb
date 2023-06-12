package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.admin.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAdminService {
    @Autowired
    private ShippingRepository shippingRepository;
    public List<ShippingInfo>  getAll(){
        return shippingRepository.findAll();
    }
}

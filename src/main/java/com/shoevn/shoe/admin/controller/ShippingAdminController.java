package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.admin.service.ShippingAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShippingAdminController {
    @Autowired
    private ShippingAdminService shippingAdminService;
    private static final String PATH = "/admin/shipping";

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<ShippingInfo> listShipping(){
        List<ShippingInfo> listShipping = shippingAdminService.getAll();
        return listShipping;
    }
}

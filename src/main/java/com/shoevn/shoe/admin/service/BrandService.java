package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.admin.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;
}

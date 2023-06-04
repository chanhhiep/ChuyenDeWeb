package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.admin.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeAdminService {
    @Autowired
    private SizeRepository sizeRepository;
    public List<Size> findAllSize(){
        return sizeRepository.findAll();
    }
}

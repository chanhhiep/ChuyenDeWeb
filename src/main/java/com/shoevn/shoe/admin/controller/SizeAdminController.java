package com.shoevn.shoe.admin.controller;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.admin.service.SizeAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SizeAdminController {
    private static final String PATH = "/admin/size";
    @Autowired
    private SizeAdminService sizeService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(PATH)
    public List<Size> listSize(){
       List<Size> sizeList = sizeService.findAllSize();
       return sizeList;
    }
}

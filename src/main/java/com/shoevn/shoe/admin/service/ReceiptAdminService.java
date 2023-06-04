package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.admin.repository.OrderDetailRepository;
import com.shoevn.shoe.admin.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptAdminService {
    @Autowired
    private OrderRepository receiptRepository;

    @Autowired
    private OrderDetailRepository receiptDetailRepository;

    public List<Order> getAllReceipt(){
        return receiptRepository.findAll();
    }
}

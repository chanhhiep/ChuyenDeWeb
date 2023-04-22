package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.admin.repository.OrderDetailRepository;
import com.shoevn.shoe.admin.repository.ReceiptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService {
    @Autowired
    private ReceiptRepository receiptRepository;

    @Autowired
    private OrderDetailRepository receiptDetailRepository;
}

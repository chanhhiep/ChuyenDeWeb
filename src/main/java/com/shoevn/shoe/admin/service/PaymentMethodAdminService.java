package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.admin.dto.PaymentMethodDto;
import com.shoevn.shoe.admin.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentMethodAdminService {
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;
    public List<PaymentMethod> listAllPaymentMethod(){
        return paymentMethodRepository.findAll();
    }
    public PaymentMethod getPaymentMethodById(long id) {
        return paymentMethodRepository.findPaymentMethodById(id);
    }
    public void uploadPaymentMethod(PaymentMethodDto paymentMethodDto) {
        System.out.println(paymentMethodDto.toString());
        Date currentDate = new Date();
        PaymentMethod paymentMethod = PaymentMethod.builder()
                .name(paymentMethodDto.getName())
                .description(paymentMethodDto.getDescription())
                .createDate(currentDate)
                .updateDate(currentDate)
                .build();
        paymentMethodRepository.save(paymentMethod);
    }
    public void deletePaymentMethod(long id){
        paymentMethodRepository.deleteById(id);
    }
    public void updatePaymentMethod(PaymentMethodDto paymentMethodDto){
        System.out.println(paymentMethodDto.toString());
        PaymentMethod paymentMethod =paymentMethodRepository.findPaymentMethodById(Long.parseLong(paymentMethodDto.getId()));
        Date currentDate = new Date();
        paymentMethod.setName(paymentMethodDto.getName());
        paymentMethod.setDescription(paymentMethodDto.getDescription());
        paymentMethod.setUpdateDate(currentDate);
        paymentMethodRepository.save(paymentMethod);
    }
    public List<PaymentMethod> getPaymentMethodByKeyword(String keyword){
        return paymentMethodRepository.searchPaymentMethod(keyword);
    }
}

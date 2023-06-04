package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.DiscountCode;
import com.shoevn.shoe.admin.dto.DiscountDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.repository.DiscountCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DiscountAdminService {
    @Autowired
    private DiscountCodeRepository discountRepository;
    public List<DiscountCode> listAllDiscount(){
        return discountRepository.findAll();
    }
    public DiscountCode getDiscountById(long id) {
        return discountRepository.findDiscountById(id);
    }
    public void uploadDiscount(DiscountDto DiscountDto) {
        System.out.println(DiscountDto.toString());
        Date currentDate = new Date();
        DiscountCode Discount = DiscountCode.builder()
                .name(DiscountDto.getName())
                .description(DiscountDto.getDescription())
                .createDate(currentDate)
                .updateDate(currentDate)
                .build();
        discountRepository.save(Discount);
    }
    public void deleteDiscount(long id){
        discountRepository.deleteById(id);
    }
    public void updateDiscount(DiscountDto discountDto){
        System.out.println(discountDto.toString());
        DiscountCode discount =discountRepository.findDiscountById(Long.parseLong(discountDto.getId()));
        Date currentDate = new Date();
        discount.setName(discountDto.getName());
        discount.setDescription(discountDto.getDescription());
        discount.setUpdateDate(currentDate);
        discountRepository.save(discount);
    }
    public List<DiscountCode> getDiscountByKeyword(SearchDto keyword){
        return discountRepository.searchDiscount(keyword.getKeywords());
    }
}

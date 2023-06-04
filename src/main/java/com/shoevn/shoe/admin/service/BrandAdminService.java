package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.admin.dto.BrandDto;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BrandAdminService {
    @Autowired
    private BrandRepository brandRepository;
    public List<Brand> listAllBrand(){
        return brandRepository.findAll();
    }
    public Brand getBrandById(long id) {
        return brandRepository.findBrandById(id);
    }
    public void uploadBrand(BrandDto BrandDto) {
        System.out.println(BrandDto.toString());
        Date currentDate = new Date();
        Brand brand = Brand.builder()
                .name(BrandDto.getName())
                .createDate(currentDate)
                .updateDate(currentDate)
                .build();
        brandRepository.save(brand);
    }
    public void deleteBrand(long id){
        brandRepository.deleteById(id);
    }
    public void updateBrand(BrandDto brandDto){
        System.out.println(brandDto.toString());
        Brand brand =brandRepository.findBrandById(Long.parseLong(brandDto.getId()));
        Date currentDate = new Date();
        brand.setName(brandDto.getName());
        brand.setUpdateDate(currentDate);
        brandRepository.save(brand);
    }
    public List<Brand> getBrandByKeyword(SearchDto keyword){
        return brandRepository.searchBrand(keyword.getKeywords());
    }
}

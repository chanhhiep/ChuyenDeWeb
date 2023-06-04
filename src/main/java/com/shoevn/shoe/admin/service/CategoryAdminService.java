package com.shoevn.shoe.admin.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoevn.shoe.Beans.Brand;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.admin.dto.CategoryDto;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.dto.Request.CategoryRequest;
import com.shoevn.shoe.admin.dto.Request.ProductRequest;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CategoryAdminService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UploadService uploadService;
    public List<Category> listAllCategory(){
        return categoryRepository.findAll();
    }
    public Category getCategoryById(long id) {
        return categoryRepository.findCategoryById(id);
    }

    public void uploadCategory(String categoryJson, MultipartFile images) {
        /*
        System.out.println(categoryDto.toString());
        String url;
        try {
            url = uploadService.uploadFile(images, "D:\\shoe\\ChuyenDeWeb\\src\\main\\resources\\static\\uploads");
            //url = uploadService.uploadFile(productDto.getImages(), "upload");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Category category = Category.builder()
                .name(categoryDto.getName())
                .img(url)
                .parent_id(Integer.parseInt(categoryDto.getIdParent()))
                .build();
                categoryRepository.save(category);

         */
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(categoryJson);
        try {
            CategoryRequest request = mapper.readValue(categoryJson,CategoryRequest.class);
            String url;
            try {
                //url = uploadService.uploadFile(images, "D:\\shoe\\ChuyenDeWeb\\src\\main\\resources\\static\\uploads");
                url = uploadService.uploadFile(images, "upload");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

           Category category = Category.builder()
                    .name(request.getName())
                    .img(url)
                    .parent_id(request.getBrand())
                    .build();
            categoryRepository.save(category);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void deleteCategory(long id){
        categoryRepository.deleteById(id);
    }
    public void updateCategory(CategoryDto categoryDto){
        System.out.println(categoryDto.toString());
        Category category = categoryRepository.findCategoryById(Long.parseLong(categoryDto.getId()));
        category.setName(categoryDto.getName());
        category.setParent_id(Integer.parseInt(categoryDto.getIdParent()));
        categoryRepository.save(category);
    }
    public List<Category> getCategoryByKeyword(SearchDto keyword){
        return categoryRepository.findBySearchKey(keyword.getKeywords());
    }
}

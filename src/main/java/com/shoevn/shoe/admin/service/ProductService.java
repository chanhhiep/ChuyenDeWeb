package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.repository.BrandRepository;
import com.shoevn.shoe.admin.repository.CategoryRepository;
import com.shoevn.shoe.admin.repository.ImageRepository;
import com.shoevn.shoe.admin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private ImageRepository imageRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(long id) {
        return productRepository.findProductById(id);
    }
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    public void uploadProduct(ProductDto productDto){
        Category category = categoryRepository.findCategoryById(Long.parseLong(productDto.getCategory_id()));
        Brand brand = brandRepository.findBrandById(Long.parseLong(productDto.getBrand()));
        List<Size> sizes = new ArrayList<>();
        List<Image> listImage=new ArrayList<>();
        for(MultipartFile image: productDto.getImages()) {
            try {
                Image imageModel = new Image(image.getOriginalFilename(), image.getContentType(), image.getBytes());
                Image saveImage = imageRepository.save(imageModel);
                listImage.add(saveImage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Product product = new Product(category, productDto.getName(),Double.parseDouble(productDto.getPrice()),Double.parseDouble(productDto.getDiscountRate()),listImage, productDto.getDescription(), brand,sizes,Integer.parseInt(productDto.getQuantity()));
        productRepository.save(product);
    }
}

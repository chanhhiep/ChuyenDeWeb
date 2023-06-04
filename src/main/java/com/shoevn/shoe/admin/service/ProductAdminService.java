package com.shoevn.shoe.admin.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
import com.shoevn.shoe.admin.dto.Request.ProductRequest;
import com.shoevn.shoe.admin.dto.SearchDto;
import com.shoevn.shoe.admin.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
public class ProductAdminService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private UploadService uploadService;
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product getProductById(long id) {
        return productRepository.findProductById(id);
    }
    public void saveProduct(Product product){
        productRepository.save(product);
    }
    /*public void uploadProduct(ProductDto productDto,MultipartFile[] images){
        System.out.println(productDto.toString());
        Category category = categoryRepository.findCategoryById(Long.parseLong(productDto.getCategory_id()));
        Brand brand = brandRepository.findBrandById(Long.parseLong(productDto.getBrand()));
        List<Size> sizes = new ArrayList<>();
        Set<Image> listImage=new HashSet<>();
        for(MultipartFile image: images) {
            try {
                Image imageModel = new Image( image.getOriginalFilename(), image.getContentType(), image.getBytes());
                Image saveImage = imageRepository.save(imageModel);
                listImage.add(saveImage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Date currentDate = new Date();
        Product product = new Product(category, productDto.getName(),Double.parseDouble(productDto.getPrice()),Double.parseDouble(productDto.getDiscountRate()),listImage, productDto.getDescription(), brand,sizes,Integer.parseInt(productDto.getQuantity()),currentDate,currentDate);
        productRepository.save(product);
    }*/

    public void uploadProduct(String productJson,MultipartFile images) {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(productJson);
        try {
            ProductRequest request = mapper.readValue(productJson,ProductRequest.class);
            Category category = categoryRepository.findCategoryById(request.getCategory_id());
            Brand brand = brandRepository.findBrandById(request.getBrand());
            List<Size> sizes = new ArrayList<>();
            for(String s: request.getSizes()){
                sizes.add(sizeRepository.findSizeById(Long.parseLong(s)));
            }
            String url;
            try {
                //url = uploadService.uploadFile(images, "D:\\shoe\\ChuyenDeWeb\\src\\main\\resources\\static\\uploads");
                url = uploadService.uploadFile(images, "upload");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Date currentDate = new Date();
            List<Review> reviews = new ArrayList<Review>();
            Product product = Product.builder()
                    .category(category)
                    .name(request.getName())
                    .price(request.getPrice())
                    .discountRate(request.getDiscountRate())
                    .images(url)
                    .description(request.getDescription())
                    .brand(brand)
                    .sizes(sizes)
                    .quantity(request.getQuantity())
                    .listReview(reviews)
                    .createDate(currentDate)
                    .updateDate(currentDate)
                    .build();
            System.out.println(product.getSizes().get(0));
            productRepository.save(product);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
    public List<Size> getAllSize(){
        return sizeRepository.findAll();
    }
    public List<Brand> getAllBrands(){
        return  brandRepository.findAll();
    }
    public void deleteProduct(long id){
        productRepository.deleteById(id);
    }
    public void updateProduct(ProductDto productDto){
        System.out.println(productDto.toString());
        Category category = categoryRepository.findCategoryById(Long.parseLong(productDto.getCategory_id()));
        Brand brand = brandRepository.findBrandById(Long.parseLong(productDto.getBrand()));
        Product product = productRepository.findProductById(Long.parseLong(productDto.getId()));
        List<Size> sizes = new ArrayList<>();
        Date currentDate = new Date();
        product.setName(productDto.getName());
        product.setCategory(category);
        product.setBrand(brand);
        product.setPrice(Double.parseDouble(productDto.getPrice()));
        product.setDescription(productDto.getDescription());
        product.setQuantity(Integer.parseInt(productDto.getQuantity()));
        product.setDiscountRate(Double.parseDouble(productDto.getDiscountRate()));
        product.setUpdateDate(currentDate);
        productRepository.save(product);
    }
    public List<Product> getProductByKeyword(SearchDto keyword){
        return productRepository.searchProduct(keyword.getKeywords());
    }
    public List<Product> getProductByKeywords(SearchDto keyword){
        return productRepository.findBySearchKey(keyword.getKeywords(),keyword.getKeywords());
    }
}

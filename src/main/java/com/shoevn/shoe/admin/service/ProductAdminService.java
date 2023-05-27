package com.shoevn.shoe.admin.service;

import com.shoevn.shoe.Beans.*;
import com.shoevn.shoe.admin.dto.ProductDto;
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
    private ImageRepository imageRepository;
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

    public void uploadProduct(ProductDto productDto,MultipartFile images) {

        System.out.println(productDto.toString());
        Category category = categoryRepository.findCategoryById(Long.parseLong(productDto.getCategory_id()));
        Brand brand = brandRepository.findBrandById(Long.parseLong(productDto.getBrand()));
        List<Size> sizes = new ArrayList<>();
        for(String size_id:productDto.getSizes()){
            sizes.add(sizeRepository.findSizeById(Long.parseLong(size_id)));
        }
        String url;
        try {
            url = uploadService.uploadFile(images, "D:\\shoe\\ChuyenDeWeb\\src\\main\\resources\\static\\uploads");
            //url = uploadService.uploadFile(productDto.getImages(), "upload");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Date currentDate = new Date();

        Product product = Product.builder()
                .category(category)
                .name(productDto.getName())
                .price(Double.parseDouble(productDto.getPrice()))
                .discountRate(Double.parseDouble(productDto.getDiscountRate()))
                .images(url)
                .description(productDto.getDescription())
                .brand(brand)
                .sizes(sizes)
                .quantity(Integer.parseInt(productDto.getQuantity()))
                .createDate(currentDate)
                .updateDate(currentDate)
                .build();
        System.out.println(product.getSizes().get(0));
        productRepository.save(product);
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
    public List<Product> getProductByKeyword(String keyword){
        return productRepository.searchProduct(keyword);
    }
}

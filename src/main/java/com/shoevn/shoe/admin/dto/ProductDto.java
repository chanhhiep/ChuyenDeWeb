package com.shoevn.shoe.admin.dto;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Image;
import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class ProductDto {
    private String category_id;
    private String name;
    private String price;
    private String discountRate;
    private String description;
    private String quantity;
    private String brand;
    private MultipartFile[] images;

    public String getCategory_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public MultipartFile[] getImages() {
        return images;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

}

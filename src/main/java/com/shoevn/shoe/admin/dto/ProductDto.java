package com.shoevn.shoe.admin.dto;

import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Image;
import jakarta.persistence.*;

import java.util.List;

public class ProductDto {
    private String category_id;
    private String name;
    private String price;
    private String discountRate;
    private String images;
    private String description;
    private String quantity;

    public String getCategory_id() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public String getImages() {
        return images;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }
}

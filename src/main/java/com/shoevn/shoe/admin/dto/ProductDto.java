package com.shoevn.shoe.admin.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shoevn.shoe.Beans.Category;
import com.shoevn.shoe.Beans.Image;
import jakarta.persistence.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

public class ProductDto {
    private String id;
    private String name;
    private String category_id;
    //private MultipartFile images;
    private String price;
    private String discountRate;
    private String description;
    private String quantity;
    private String brand;
    private List<String> sizes;

    public ProductDto(String id, String name, String category_id, String price, String discountRate, String description, String quantity, String brand, List<String> sizes) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.price = price;
        this.discountRate = discountRate;
        this.description = description;
        this.quantity = quantity;
        this.brand = brand;
        this.sizes = sizes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public List<String> getSizes() {
        return sizes;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "category_id='" + category_id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", description='" + description + '\'' +
                ", quantity='" + quantity + '\'' +
                ", brand='" + brand + '\'' +
                ", sizes=" + sizes +
                '}';
    }
}

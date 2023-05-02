package com.shoevn.shoe.Beans;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, //
            foreignKey = @ForeignKey(name = "Category_PROD_FK"))
    private Category category;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
    @Column(name = "price",nullable = false)
    private double price;
    @Column(name = "discount_rate",nullable = false)
    private double discountRate;
    @OneToMany(mappedBy = "product")
    @Column(name = "image",nullable = false)
    private List<Image> images;
    @Column(name = "description",nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false, //
            foreignKey = @ForeignKey(name = "brand_PROD_FK"))
    private Brand brand;
    @OneToMany(mappedBy = "product")
    @Column(name = "Size",nullable = false)
    private List<Size> sizes;
    @Column(name = "quantity",nullable = false)
    private int quantity;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_product",nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_product",nullable = false)
    private Date updateDate;

    public Product(){}

    public Product(Long id, Category category, String name, double price, double discountRate, List<Image> images, String description, Brand brand, List<Size> sizes, int quantity, Date createDate, Date updateDate) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.images = images;
        this.description = description;
        this.brand = brand;
        this.sizes = sizes;
        this.quantity = quantity;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}

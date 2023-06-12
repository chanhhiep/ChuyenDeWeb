package com.shoevn.shoe.Beans;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@EqualsAndHashCode(callSuper = true)
public class Product extends AuditableBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", nullable = false, //
            foreignKey = @ForeignKey(name = "Category_PROD_FK"))
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category category;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
    @Column(name = "price",nullable = false)
    private double price;
    @Column(name = "discount_rate",nullable = false)
    private double discountRate;
    @Column(name = "image")
    private String images;
    @Column(name = "description",nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false, //
            foreignKey = @ForeignKey(name = "brand_PROD_FK"))
    private Brand brand;
    /*
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL
    @Column(name = "size",nullable = false)
    private List<Size> sizes;
    */
    @Column(name = "quantity",nullable = false)
    private int quantity;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Review> listReview;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date",nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_date",nullable = false)
    private Date updateDate;

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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
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

    public List<Review> getListReview() {
        return listReview;
    }

    public void setListReview(List<Review> listReview) {
        this.listReview = listReview;
    }
}

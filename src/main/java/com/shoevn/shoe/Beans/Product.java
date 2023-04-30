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
    @Column(name = "sell_price",nullable = false)
    private double discountRate;
    @OneToMany
    @JoinColumn(name = "image_id", nullable = false, //
            foreignKey = @ForeignKey(name = "image_PROD_FK"))
    @Column(name = "image",nullable = false)
    private List<Image> images;
    @Column(name = "description",nullable = false)
    private String description;
    @OneToOne
    @JoinColumn(name = "brand_id", nullable = false, //
            foreignKey = @ForeignKey(name = "brand_PROD_FK"))
    @Column(name = "brand",nullable = false)
    private Brand brand;
    @Column(name = "quantity",nullable = false)
    private String quantity;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_product",nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_product",nullable = false)
    private Date updateDate;

    public Product(){}

}

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id",length = 20,nullable = false)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, //
            foreignKey = @ForeignKey(name = "Category_PROD_FK"))
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category category;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
    @Column(name = "price",nullable = false)
    @NumberFormat( style = NumberFormat.Style.CURRENCY)
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
    private List<Review> listComment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


    public double getSellPrice() {
        return sellPrice;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Review> getListComment() {
        return listComment;
    }

    public void setListComment(List<Review> listComment) {
        this.listComment = listComment;
    }
}

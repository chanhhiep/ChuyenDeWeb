package com.example.shoes.Beans;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "size")
public class Size implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "size_id",length = 20,nullable = false)
    private String sizeId;
    @Column(name = "size_num",nullable = false)
    private int size_num;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, //
            foreignKey = @ForeignKey(name = "SIZE_PROD_FK"))
    private Product product;
    public Size(){}

    public String getSizeId() {
        return sizeId;
    }

    public int getSize_num() {
        return size_num;
    }

    public Product getProduct() {
        return product;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public void setSize_num(int size_num) {
        this.size_num = size_num;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId='" + sizeId + '\'' +
                ", size_num=" + size_num +
                ", product=" + product +
                '}';
    }
}

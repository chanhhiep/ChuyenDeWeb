package com.shoevn.shoe.Beans;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
@Entity
@Table(name = "size")
public class Size implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id", nullable = false)
    private Long sizeId;
    @Column(name = "size_num",nullable = false)
    private int size_num;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false, //
            foreignKey = @ForeignKey(name = "SIZE_PROD_FK"))
    private Product product;
    public Size(){}

    public Size(Long sizeId, int size_num, Product product) {
        this.sizeId = sizeId;
        this.size_num = size_num;
        this.product = product;
    }

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public int getSize_num() {
        return size_num;
    }

    public Product getProduct() {
        return product;
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

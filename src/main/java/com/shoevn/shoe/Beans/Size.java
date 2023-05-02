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
    @Column(name = "size_description",nullable = false)
    private int size_description;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", nullable = false, //
//            foreignKey = @ForeignKey(name = "SIZE_PROD_FK"))
//    private Product product;
    public Size(){}

    public Size(Long sizeId, int size_num, int size_description) {
        this.sizeId = sizeId;
        this.size_num = size_num;
        this.size_description = size_description;
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

    public void setSize_num(int size_num) {
        this.size_num = size_num;
    }

    public int getSize_description() {
        return size_description;
    }

    public void setSize_description(int size_description) {
        this.size_description = size_description;
    }

    @Override
    public String toString() {
        return "Size{" +
                "sizeId=" + sizeId +
                ", size_num=" + size_num +
                ", size_description=" + size_description +
                '}';
    }
}

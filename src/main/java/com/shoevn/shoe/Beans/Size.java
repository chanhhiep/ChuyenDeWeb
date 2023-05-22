package com.shoevn.shoe.Beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
@Entity
@Table(name = "size")
public class Size implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "size_num",nullable = false)
    private int size_num;
    @Column(name = "size_description",nullable = false)
    private String description;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "product_id", nullable = false, //
//            foreignKey = @ForeignKey(name = "SIZE_PROD_FK"))
//    private Product product;
@ManyToOne
@JoinColumn(name = "product_id")
@JsonBackReference
private Product product;
    public Size(){}

    public Size(Long id, int size_num, String description, Product product) {
        this.id = id;
        this.size_num = size_num;
        this.description = description;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id=" + id +
                ", size_num=" + size_num +
                ", description='" + description + '\'' +
                ", product=" + product +
                '}';
    }
}

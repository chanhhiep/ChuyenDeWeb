package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category")

public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category", nullable = false)
    private Long id_category;
    @Column(name = "name", length = 255, nullable = false)
    private String name;
    @Column(name = "img", length = 255)
    private String img;
    @Column(name = "parent_id",length = 20, nullable = false)
    private int parent_id;

    public Category() {

    }

    public Category(Long id_category, String name, String img, int parent_id) {
        this.id_category = id_category;
        this.name = name;
        this.img = img;
        this.parent_id = parent_id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id_category=" + id_category +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", parent_id=" + parent_id +
                '}';
    }
}

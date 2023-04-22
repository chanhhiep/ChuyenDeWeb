package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "sales")
public class Sale implements Serializable {
    private static final long serialVersionUID = -2576670215015463100L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", length = 50)
    private String id;
    @Column(name = "numSale")
    private double numSale;
    @Column(name = "name")
    private  String name;
    public Sale(){

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getNumSale() {
        return numSale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumSale(double numSale) {
        this.numSale = numSale;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", numSale=" + numSale +
                ", name='" + name + '\'' +
                '}';
    }
}

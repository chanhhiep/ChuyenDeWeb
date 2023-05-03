package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "sales")
public class Sale implements Serializable {
    private static final long serialVersionUID = -2576670215015463100L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "numSale")
    private double numSale;
    @Column(name = "name")
    private  String name;
    public Sale(){

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

    public void setId(Long id) {
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

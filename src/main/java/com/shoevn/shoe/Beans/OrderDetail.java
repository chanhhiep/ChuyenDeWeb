package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "order_Details")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 7550745928843183535L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", nullable = false, //
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
    private Order order;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false, //
            foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
    private Product product;
    @Column(name = "Quanity", nullable = false)
    private int quanity;
    @Column(name = "Price", nullable = false)
    private double price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "size_id", nullable = false, //
            foreignKey = @ForeignKey(name = "SIZE_DETAIL_PROD_FK"))
    private Size size;
    @Column(name = "note", length = 128, nullable = false)
    private String note;
    public OrderDetail(){
    }

    public OrderDetail(Long id, Order order, Product product, int quanity, double price, Size size, String note) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quanity = quanity;
        this.price = price;
        this.size = size;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                ", quanity=" + quanity +
                ", price=" + price +
                ", size=" + size +
                ", note='" + note + '\'' +
                '}';
    }
}

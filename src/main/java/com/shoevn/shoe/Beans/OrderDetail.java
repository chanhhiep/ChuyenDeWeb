package com.example.shoes.Beans;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "order_Details")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 7550745928843183535L;
    @Id
    @Column(name = "ID", length = 50, nullable = false)
    private int id;
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
    @Column(name = "note", length = 128, nullable = false)
    private String note;
    @Temporal(TemporalType.DATE)
    @Column(name = "Create_Date", nullable = false)
    private Date orderDatedetail;

    public OrderDetail(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getOrderDatedetail() {
        return orderDatedetail;
    }

    public void setOrderDatedetail(Date orderDatedetail) {
        this.orderDatedetail = orderDatedetail;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", product=" + product +
                ", quanity=" + quanity +
                ", price=" + price +
                ", note='" + note + '\'' +
                ", orderDatedetail=" + orderDatedetail +
                '}';
    }
}

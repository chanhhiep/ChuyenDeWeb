package com.shoevn.shoe.Beans;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    private static final long serialVersionUID = -2576670215015463100L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipping_id", nullable = false, //
            foreignKey = @ForeignKey(name = "Ship_DETAIL_ORD_FK"))
    private ShippingInfo shippingInfo;
    @Column(name = "Amount", nullable = false)
    private double amount;
    @Column(name = "note", length = 128, nullable = false)
    private String note;
    @Column(name = "state", length = 128, nullable = false)
    private String state;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_order",nullable = false)
    private Date createDate;
    public Order(){
    }

    public Order(Long id, ShippingInfo shippingInfo, double amount, String note, String state, Date createDate) {
        this.id = id;
        this.shippingInfo = shippingInfo;
        this.amount = amount;
        this.note = note;
        this.state = state;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", shippingInfo=" + shippingInfo +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", state='" + state + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}

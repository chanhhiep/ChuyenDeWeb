package com.shoevn.shoe.Beans;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    private static final long serialVersionUID = -2576670215015463100L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 50)
    private long id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "shipping_id", nullable = false, //
//            foreignKey = @ForeignKey(name = "Ship_DETAIL_ORD_FK"))
//    private ShippingInfo shippingInfo;
    @Column(name = "Amount", nullable = false)
    private double amount;
    @Column(name = "Customer_Address", length = 255, nullable = false)
    private String customerAddress;
    @Column(name = "Customer_Email", length = 128, nullable = false)
    private String customerEmail;
    @Column(name = "Customer_Name", length = 255, nullable = false)
    private String customerName;
    @Column(name = "Customer_Phone", length = 128, nullable = false)
    private String  customerPhone;
//    @Column(name = "state", length = 128, nullable = false)
//    private String state;
    @Column(name = "note", length = 128, nullable = false)
    private String note;
    @Temporal(TemporalType.DATE)
    @Column(name = "Create_Date", nullable = false)
    private Date orderDate;

    public Order(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", note='" + note + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

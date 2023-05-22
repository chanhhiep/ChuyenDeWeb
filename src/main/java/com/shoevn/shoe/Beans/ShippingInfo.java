package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "shipping")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "shipping_email", length = 128, nullable = false)
    private String shippingEmail;
    @Column(name = "shipping_name", length = 255, nullable = false)
    private String name;
    @Column(name = "shipping_phone", length = 128, nullable = false)
    private String phone;
    @Column(name = "shipping_address", length = 255, nullable = false)
    private String address;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date",nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_date",nullable = false)
    private Date updateDate;

    public ShippingInfo(){

    }

    public ShippingInfo(String shippingEmail, String name, String phone, String address, Date createDate, Date updateDate) {
        this.shippingEmail = shippingEmail;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShippingEmail() {
        return shippingEmail;
    }

    public void setShippingEmail(String shippingEmail) {
        this.shippingEmail = shippingEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "id=" + id +
                ", shippingEmail='" + shippingEmail + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}

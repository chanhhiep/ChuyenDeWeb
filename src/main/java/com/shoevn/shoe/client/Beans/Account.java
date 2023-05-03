package com.shoevn.shoe.Beans;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {
    private static final long serialVersionUID = -2054386655979281969L;
    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",length = 20,nullable = false)
    private long id;
    @Column(name = "username", length = 20,nullable = false)
    private String username;
    @Column(name = "password",length = 128,nullable = false)
    private String password;
    @Column(name = "name",length = 255,nullable = false)
    private String name;
    @Column(name = "email",length = 128,nullable = false)
    private String email;
    @Column(name = "phone",length = 10,nullable = false)
    private String phone;
    @Column(name = "active",length = 1,nullable = false)
    private boolean active;
    @Column(name = "user_role",length = 20,nullable = false)
    private String user_role;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "shipping_id", nullable = false, //
//            foreignKey = @ForeignKey(name = "SHIPPING_PROD_FK"))
//    private ShippingInfo shippingInfo;
    public  Account(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", active=" + active +
                ", user_role='" + user_role + '\'' +
                '}';
    }
}
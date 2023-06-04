package com.shoevn.shoe.Beans;

import javax.persistence.*;
import java.io.Serializable;

public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",length = 20,nullable = false)
    private long id;
    @Column(name = "username", length = 20,nullable = false)
    private String username;
    @Column(name = "password",length = 128,nullable = false)
    private String password;
    @Column(name = "name",length = 255)
    private String name;
    @Column(name = "email",length = 128,nullable = false)
    private String email;
    @Column(name = "phone",length = 10,nullable = false)
    private String phone;
    @Column(name = "active",length = 1)
    private boolean active;
    @Column(name = "user_role",length = 20)
    private String user_role = "customer";
    public  Account(){

    }

    public Account(long id, String username, String password, String name, String email, String phone, boolean active, String user_role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.active = active;
        this.user_role = user_role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}

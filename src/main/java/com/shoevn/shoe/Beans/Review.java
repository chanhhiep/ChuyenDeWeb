package com.example.shoes.Beans;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "reviews")
public class Review implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", length = 50, nullable = false)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false, //
            foreignKey = @ForeignKey(name = "Acc_PROD_FK"))
    private Account account;
    private int star;
    @Column(name = "cmt", length = 255)
    private String cmt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", account=" + account +
                ", star=" + star +
                ", cmt='" + cmt + '\'' +
                '}';
    }
}
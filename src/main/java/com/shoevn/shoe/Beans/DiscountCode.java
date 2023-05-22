
package com.shoevn.shoe.Beans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "discountcode")
public class DiscountCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date",nullable = false)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "update_date",nullable = false)
    private Date updateDate;

    public DiscountCode(){

    }
    public DiscountCode(String name, String description, Date createDate, Date updateDate) {
        this.name = name;
        this.description = description;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

}


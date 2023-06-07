package com.shoevn.shoe.Beans;

import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
@EqualsAndHashCode(callSuper = true)
public class Order extends AuditableBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 50)
    private long id;
    @OneToOne(fetch = FetchType.LAZY,cascade =CascadeType.REMOVE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ShippingInfo shippingInfo;
    @OneToOne(fetch = FetchType.LAZY,cascade =CascadeType.REMOVE)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User account;
    @OneToOne
    @JoinColumn(name = "payment_id",nullable = false)
    private PaymentMethod paymentMethod;
    @Column(name = "state", length = 128)
    private String state;
    @Column(name = "note", length = 128)
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        this.account = account;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

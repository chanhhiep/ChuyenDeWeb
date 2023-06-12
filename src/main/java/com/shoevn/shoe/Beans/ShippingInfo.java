
package com.shoevn.shoe.Beans;


import com.shoevn.shoe.Beans.base.AuditableBase;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shipping")
@EqualsAndHashCode(callSuper = true)
public class ShippingInfo extends AuditableBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_id")
    private Long id;
    @Column(name = "shipping_email", length = 128, nullable = false)
    private String shippingEmail;
    @Column(name = "shipping_name", length = 255, nullable = false)
    private String shippingName;
    @Column(name = "shipping_phone", length = 128, nullable = false)
    private String shippingPhone;
    @Column(name = "shipping_address", length = 255, nullable = false)
    private String shippingAddress;
    @Column(name = "ward", length = 255, nullable = false)
    private String ward;
    @Column(name = "district", length = 255, nullable = false)
    private String district;
    @Column(name = "province", length = 255, nullable = false)
    private String province;

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

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}


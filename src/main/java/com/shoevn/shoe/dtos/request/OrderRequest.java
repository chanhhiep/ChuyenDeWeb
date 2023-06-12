package com.shoevn.shoe.dtos.request;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.Beans.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long idPayment;
    private String note;
    private String state;
    private String email;
    private String name;
    private String phone;
    private String address;
    private String ward;
    private String district;
    private String province;
    private double totalOrder;
}

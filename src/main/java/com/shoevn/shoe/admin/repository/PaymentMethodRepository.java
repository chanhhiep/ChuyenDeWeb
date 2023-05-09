package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Long> {

}

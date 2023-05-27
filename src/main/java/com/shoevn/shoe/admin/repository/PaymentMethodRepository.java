package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.Beans.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Long> {
    @Query("SELECT u FROM PaymentMethod u WHERE u.id = ?1")
    public PaymentMethod findPaymentMethodById(long id);
    @Modifying
    @Query("select b from PaymentMethod b where b.name like ?1")
    public List<PaymentMethod> searchPaymentMethod(String keyword);
}

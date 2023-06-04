package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<ShippingInfo,Long> {
}

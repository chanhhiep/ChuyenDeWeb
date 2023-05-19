package com.shoevn.shoe.Dao;

import com.shoevn.shoe.Beans.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Long> {
}

package com.shoevn.shoe.admin.repository;

import com.shoevn.shoe.Beans.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query("select  o from Order o join ShippingInfo s on s.id = o.shippingInfo.id where o.id = ?1")
    public Order getOrderById(long id);

    @Query("select  o from Order o where o.account.id = ?1")
    public List<Order> getOrderByUser(Long id);

}

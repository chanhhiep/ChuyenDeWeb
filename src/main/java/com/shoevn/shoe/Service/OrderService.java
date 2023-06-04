package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.Beans.ShippingInfo;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.admin.repository.OrderRepository;
import com.shoevn.shoe.admin.repository.PaymentMethodRepository;
import com.shoevn.shoe.admin.repository.ShippingRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.dtos.OrderDto;
import com.shoevn.shoe.dtos.auth.OrderDTO;
import com.shoevn.shoe.dtos.mappers.OrderDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDtoMapper orderDtoMapper;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PaymentMethodRepository paymentRepository;
    @Autowired
    private ShippingRepository shippingRepository;

    public Order createOrder(OrderDTO dto){
        Order order = new Order();

        User user = userRepository.findById(dto.getUser()).get();
        PaymentMethod payment = paymentRepository.findById(dto.getPayment()).get();
        ShippingInfo ship = shippingRepository.findById(dto.getShipping()).get();

        order.setAccount(user);
        order.setPaymentMethod(payment);
        order.setShippingInfo(ship);
        order.setState(dto.getState());
        order.setNote(dto.getNote());
        return orderRepository.save(order);
    }
    public OrderDto getAllOrderById(long id){
        return orderDtoMapper.apply(orderRepository.findById(id).get());
    }
}

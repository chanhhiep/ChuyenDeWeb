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
import com.shoevn.shoe.dtos.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public OrderDto createOrder(OrderRequest request,String email) {
        User user = userRepository.findByEmail(email).get();
        ShippingInfo shippingInfo = ShippingInfo.builder()
                .shippingEmail(request.getEmail())
                .shippingName(request.getName())
                .shippingAddress(request.getAddress())
                .shippingPhone(request.getPhone())
                .ward(request.getWard())
                .district(request.getDistrict())
                .province(request.getProvince())
                .build();
       shippingRepository.save(shippingInfo);
       PaymentMethod paymentMethod = paymentRepository.findById(request.getIdPayment()).get();
       System.out.println(shippingInfo);
        Order order = Order.builder()
                .account(user)
                .shippingInfo(shippingInfo)
                .paymentMethod(paymentMethod)
                .note(request.getNote())
                .state(request.getState())
                .totalOrder(request.getTotalOrder())
                .build();
        Order save = orderRepository.save(order);
        return orderDtoMapper.apply(save);

    }
    public OrderDto getAllOrderById(long id){
        return orderDtoMapper.apply(orderRepository.findById(id).get());
    }
    public List<OrderDto> getAllOrderByUser(Long idUser){
        List<Order> orderList = orderRepository.getOrderByUser(idUser);
        List<OrderDto> orderDtos = orderList.stream().map(orderDtoMapper::apply).collect(Collectors.toList());
        return orderDtos;
    }
}

package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Order;
import com.shoevn.shoe.Beans.OrderDetail;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.admin.repository.OrderDetailRepository;
import com.shoevn.shoe.admin.repository.OrderRepository;
import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.admin.repository.SizeRepository;
import com.shoevn.shoe.dtos.OrderDetailDto;
import com.shoevn.shoe.dtos.auth.OrderDetailDTO;
import com.shoevn.shoe.dtos.mappers.OrderDetaikDtoMapper;
import com.shoevn.shoe.dtos.request.OrderDetailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderDetailService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderDetaikDtoMapper mapper;
    @Autowired
    private ProductRepository productRepository;

    public OrderDetail create(OrderDetailRequest request,Long idOrder){
        Order order = orderRepository.findById(idOrder).get();
        Product product = productRepository.findById(request.getProduct()).get();

        OrderDetail orderDetail = OrderDetail.builder()
                .order(order)
                .product(product)
                .quantity(request.getQuantity())
                .size(request.getSize())
                .total(request.getTotal())
                .note(request.getNote())
                .build();

        return orderDetailRepository.save(orderDetail);
    }

   /* public OrderDetailDto create(@Valid OrderDetailRequest request){
        Order order = orderRepository.findById(request.getOrder()).get();
        Size size = sizeRepository.findById(request.getSize()).get();

        OrderDetail orderDetail = OrderDetail.builder()
                .order(order)
                .product(product)
                .quantity(request.getQuantity())
                .size(request.getSize())
                .total(request.getTotal())
                .note(request.getNote())
                .build();

        OrderDetail save = orderDetailRepository.save(orderDetail);
        return mapper.apply(save);
    }*/


    public List<OrderDetailDto> getLstOrderByUser(long idUser){
        List<OrderDetail> list = orderDetailRepository.getOrderDetailByUser(idUser);
        List<OrderDetailDto>  detailDtos = list.stream().map(mapper::apply).collect(Collectors.toList());
        return detailDtos;
    }

    public List<OrderDetailDto> getOrderDetailByOrder(long idOrder){
        List<OrderDetail> list = orderDetailRepository.getOrderDetailByOrder(idOrder);
        List<OrderDetailDto>  detailDtos = list.stream().map(mapper::apply).collect(Collectors.toList());
        return detailDtos;
    }
}

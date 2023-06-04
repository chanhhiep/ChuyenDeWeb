package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Cart;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.admin.repository.SizeRepository;
import com.shoevn.shoe.client.repository.CartRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.dtos.CartDto;
import com.shoevn.shoe.dtos.auth.CartDTO;
import com.shoevn.shoe.dtos.mappers.CartDtoMapper;
import com.shoevn.shoe.dtos.request.CartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private SizeRepository sizeRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CartDtoMapper mapper;

    public Cart addProToCart(CartDTO cartDto){
        Cart cart = new Cart();
        Size size = sizeRepository.findById(cartDto.getSize()).get();
        User user = userRepository.findById(cartDto.getUser()).get();
        cart.setSize(size);
        cart.setUser(user);
        cart.setQuantity(cartDto.getQuantity());

        return cartRepository.save(cart);
    }
    public CartDto addCart(@Valid CartRequest request){
        User user = userRepository.findById(request.getUser()).get();
        Size size = sizeRepository.findById(request.getSize()).get();

        Cart cart = Cart.builder()
                .user(user).size(size).quantity(request.getQuantity()).build();
        Cart save = cartRepository.save(cart);
        return mapper.apply(save);
    }
    public void removeCart(long id){
        cartRepository.deleteById(id);
    }


    public List<CartDto> getAllProToCartByUser(long user_id){
        List<Cart> list = cartRepository.findByUser(user_id);
        List<CartDto> cartDtos = list.stream().map(mapper::apply).collect(Collectors.toList());
        return cartDtos;
    }
}

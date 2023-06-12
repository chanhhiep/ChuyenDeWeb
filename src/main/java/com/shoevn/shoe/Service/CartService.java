package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Cart;
import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Size;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.admin.repository.SizeRepository;
import com.shoevn.shoe.client.repository.CartRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.dtos.CartDto;
import com.shoevn.shoe.dtos.auth.CartDTO;
import com.shoevn.shoe.dtos.mappers.CartDtoMapper;
import com.shoevn.shoe.dtos.request.CartRequest;
import com.shoevn.shoe.dtos.request.UpdateCartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartDtoMapper mapper;


    public CartDto addCart(Long productID,String email,CartRequest request) {
        Product product = productRepository.findById(productID).get();
        User user = userRepository.findByEmail(email).get();

        Cart cart = Cart.builder()
                .product(product)
                .user(user)
                .size(request.getSize())
                .quantity(request.getQuantity())
                .build();
        Cart save = cartRepository.save(cart);
       return mapper.apply(save);
    }

    public  CartDto updateCart(UpdateCartRequest request){
        Optional<Cart> optionalCart = cartRepository.findById(request.getId());
        Cart cart =  optionalCart.get();
        cart.setQuantity(cart.getQuantity() + request.getQuantity());
        Cart save = cartRepository.save(cart);
        return  mapper.apply(save);
    }


    public void removeCart(long id) {
        cartRepository.deleteById(id);
    }


    public List<CartDto> getAllProToCartByUser(long user_id) {
        List<Cart> list = cartRepository.findByUser(user_id);
        List<CartDto> cartDtos = list.stream().map(mapper::apply).collect(Collectors.toList());
        return cartDtos;
    }
}

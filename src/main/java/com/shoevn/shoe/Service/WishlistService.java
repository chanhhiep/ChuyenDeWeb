package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.Beans.Wishlist;
import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.client.repository.WishlistRepository;
import com.shoevn.shoe.dtos.WishlistDto;
import com.shoevn.shoe.dtos.mappers.WishlistDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WishlistService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WishlistRepository repository;
    @Autowired
    private WishlistDtoMapper mapper;

    public WishlistDto addWishlist(Long productID, String email){
        Product product = productRepository.findById(productID).get();
        User user = userRepository.findByEmail(email).get();
        Wishlist wishlist = Wishlist.builder().product(product).user(user).build();
        Wishlist save = repository.save(wishlist);
        return mapper.apply(save);
    }

    public void removeWishlist(long id) {
        repository.deleteById(id);
    }
    public List<WishlistDto> getAllProToWishlist(long userId){
        List<Wishlist> list = repository.findByUser(userId);
        List<WishlistDto> dtos= list.stream().map(mapper::apply).collect(Collectors.toList());
        return dtos;
    }
}

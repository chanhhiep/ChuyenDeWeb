package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.Product;
import com.shoevn.shoe.Beans.Review;
import com.shoevn.shoe.Beans.User;
import com.shoevn.shoe.admin.repository.ProductRepository;
import com.shoevn.shoe.admin.repository.ReviewRepository;
import com.shoevn.shoe.client.repository.UserRepository;
import com.shoevn.shoe.dtos.request.ReviewRequest;
import com.shoevn.shoe.socket_io.SocketHandleGlobal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    SocketHandleGlobal socket;

    @Transactional
    public Review creatReview(String email, ReviewRequest request) {
        User user = userRepository.findByEmail(email).get();
        Product product = productRepository.findById(request.getIdPro()).get();
        Review comment = Review.builder()
                .cmt(request.getCmt())
                .account(user)
                .star(request.getStar())
                .build();
        Review sReview = repository.save(comment);
        product.getListReview().add(comment);
        productRepository.save(product);
        List<User> list = userRepository.findAll();
        for (User client:list) {
            socket.sendEvent(client.getId(),"comment",sReview);
        }
        return sReview;
    }
}

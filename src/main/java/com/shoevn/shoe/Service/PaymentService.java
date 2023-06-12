package com.shoevn.shoe.Service;

import com.shoevn.shoe.Beans.PaymentMethod;
import com.shoevn.shoe.admin.repository.PaymentMethodRepository;
import com.shoevn.shoe.dtos.PaymentDto;
import com.shoevn.shoe.dtos.mappers.PaymentDtoMapper;
import com.shoevn.shoe.dtos.request.PaymentRequest;
import com.shoevn.shoe.exceptions.ExitException;
import com.shoevn.shoe.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentMethodRepository paymentRepository;
    @Autowired
    private PaymentDtoMapper paymentDtoMapper;

    public PaymentDto createPayment(@Valid PaymentRequest request){
        Optional<PaymentMethod> optionalPayment = paymentRepository.findByName(request.getName());
        if (optionalPayment.isPresent()){
            throw new ExitException(HttpStatus.BAD_REQUEST,"Payment is exits");
        }
        PaymentMethod paymentMethod = PaymentMethod.builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();
        PaymentMethod save = paymentRepository.save(paymentMethod);
        return  paymentDtoMapper.apply(save);
    }

    public Response deletePayment(Long payment_id){
        Optional<PaymentMethod> optionalPaymentMethod = paymentRepository.findById(payment_id);
        PaymentMethod paymentMethod = optionalPaymentMethod.get();
        paymentRepository.delete(paymentMethod);
        return new Response(200,null,null);
    }
    public  void deletePayment1(Long idPayment){
        paymentRepository.deleteById(idPayment);
    }
}

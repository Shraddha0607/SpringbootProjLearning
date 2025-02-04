package com.shraddhaLearning.springbootLearningProj.Service;

import com.shraddhaLearning.springbootLearningProj.DTO.PaymentRequest;
import com.shraddhaLearning.springbootLearningProj.DTO.PaymentResponse;
import com.shraddhaLearning.springbootLearningProj.Entity.PaymentEntity;
import com.shraddhaLearning.springbootLearningProj.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    // get the reponse and send it in the format of response DTO
    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){
        // fetch data from db, then convert to PaymentResponse
        PaymentEntity paymentModel = paymentRepository.getPaymentById(internalRequestObj);

        PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
        return  paymentResponse;
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity){
        // here we need to change it
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentId(paymentEntity.getId());
        paymentResponse.setAmount(paymentEntity.getPaymentAmount());
        paymentResponse.setCurrency(paymentEntity.getPaymentCurrency());
        return paymentResponse;
    }
}

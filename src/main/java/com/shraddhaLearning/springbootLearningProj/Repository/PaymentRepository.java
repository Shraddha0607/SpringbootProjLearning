package com.shraddhaLearning.springbootLearningProj.Repository;

import com.shraddhaLearning.springbootLearningProj.DTO.PaymentRequest;
import com.shraddhaLearning.springbootLearningProj.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }

    private PaymentEntity executeQuery(PaymentRequest request){
        PaymentEntity payment = new PaymentEntity();
        // as for now, not using db, so create this function
        // so need to create object, and set the default values for that
        payment.setId(request.getPaymentId());
        payment.setPaymentAmount(100.00);
        payment.setPaymentCurrency("Rupee");
        payment.setUserEmail("test@gmail.com");

        return payment;
    }
}

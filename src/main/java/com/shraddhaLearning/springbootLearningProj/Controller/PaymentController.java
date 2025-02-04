package com.shraddhaLearning.springbootLearningProj.Controller;

import com.shraddhaLearning.springbootLearningProj.DTO.PaymentRequest;
import com.shraddhaLearning.springbootLearningProj.DTO.PaymentResponse;
import com.shraddhaLearning.springbootLearningProj.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    // get mapping
    // getPaymentById
    // use request DTO
    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id){

        // we need to create paymentRequestDTO
        PaymentRequest paymentRequestObj= new PaymentRequest();
        paymentRequestObj.setPaymentId(id);

        // now need to call service method, using this requestObj
        PaymentResponse payment = paymentService.getPaymentDetailsById(paymentRequestObj);
        return ResponseEntity.ok(payment);
    }
}

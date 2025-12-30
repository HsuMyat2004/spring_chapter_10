package org.example.spring_chapter_10.rest_api_part4;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}

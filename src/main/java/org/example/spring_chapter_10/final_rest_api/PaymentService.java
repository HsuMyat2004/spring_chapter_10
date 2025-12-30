package org.example.spring_chapter_10.final_rest_api;

import org.example.spring_chapter_10.rest_api_part2_exception_handling.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}

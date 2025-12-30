package org.example.spring_chapter_10.final_rest_api;

import org.apache.coyote.Response;
import org.example.spring_chapter_10.rest_api_part2_exception_handling.NotEnoughMoneyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {


    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay-amount")
    public ResponseEntity<PaymentDetails> gonnaPay(@RequestBody PaymentDetails paymentDetails) {
       // paymentDetails.getAmount(); // request body's value retrieved
        if(paymentDetails.getAmount() <= 0){
            throw new PaymentExceptionHandler();
        }
        return  ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

}

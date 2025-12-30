package org.example.spring_chapter_10.rest_api_part4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {
    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());
    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {
               logger.info("Recieved Payment " + paymentDetails.getAmount());
                paymentDetails.getAmount();
               return ResponseEntity.status(HttpStatus.ACCEPTED)
               .body(paymentDetails);
    }
}

package org.example.spring_chapter_10.final_rest_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(PaymentExceptionHandler.class)
    public ResponseEntity<ErrorDetails> notEnoughMoney(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to pay bro!");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}

package org.example.spring_chapter_10.final_rest_api;

public class InvalidPaymentAmountHandler extends RuntimeException{
    public InvalidPaymentAmountHandler() {
        super("Invalid payment amount , can't pay bro!");
    }

    /*
    public InvalidPaymentAmountHandler(String message) {
        super(message);
    }
     */
}

package com.lpu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Payments paymentService() {
        return new CreditCard();
    }

    @Bean
    public CheckoutService checkoutService() {
        return new CheckoutService(paymentService());
    }
}
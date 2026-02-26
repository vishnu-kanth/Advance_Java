package com.lpu;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        CheckoutService checkoutService =
                context.getBean(CheckoutService.class);

        checkoutService.checkout(5000);
    }
}

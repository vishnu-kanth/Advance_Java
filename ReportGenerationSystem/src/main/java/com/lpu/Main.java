package com.lpu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReportServices.class);

        ReportController controller =
                context.getBean(ReportController.class);

        controller.createReport();
    }
}

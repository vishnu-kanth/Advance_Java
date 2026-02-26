package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = ioc.getBean("emp", Employee.class);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}


package com.lpu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            Product product = new Product();

            product.setName("Smartphone");
            product.setDescription("Latest 5G mobile phone");
            product.setCategory("Electronics");
            product.setQuantity(25);
            product.setPrice(new java.math.BigDecimal("75000.00"));
            product.setSku("MOB56789");
            product.setActive(true);

            session.beginTransaction();

            session.persist(product);

            session.getTransaction().commit();

            System.out.println("Product saved successfully!");

        } finally {
            factory.close();
        }
    }
}

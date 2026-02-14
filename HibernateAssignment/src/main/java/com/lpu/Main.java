package com.lpu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {

            // Create
            session.beginTransaction();

            Product product = new Product();
            product.setName("Laptop");
            product.setDescription("Gaming Laptop");
            product.setCategory("Electronics");
            product.setQuantity(5);
            product.setPrice(new BigDecimal("79000.00"));
            product.setSku("LAP001");
            product.setActive(true);

            session.persist(product);

            session.getTransaction().commit();
            System.out.println("Product Inserted!");



            // Read
            session.beginTransaction();

            List<Product> products = session.createQuery("from Product", Product.class).list();

            for (Product p : products) {
                System.out.println(p);
            }

            session.getTransaction().commit();



            //Update
            session.beginTransaction();

            Product updateProduct = session.get(Product.class, product.getId());
            updateProduct.setPrice(new BigDecimal("75000.00"));

            session.getTransaction().commit();
            System.out.println("Product Updated!");


            //Delete
            session.beginTransaction();

            Product deleteProduct = session.get(Product.class, product.getId());
            session.remove(deleteProduct);

            session.getTransaction().commit();
            System.out.println("Product Deleted!");

        } finally {
            session.close();
            factory.close();
        }
    }
}

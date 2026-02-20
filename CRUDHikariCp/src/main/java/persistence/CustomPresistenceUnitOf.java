package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomPresistenceUnitOf {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("myJpaUnit");

    // Method to get EntityManager
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Method to close factory (call when application shuts down)
    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
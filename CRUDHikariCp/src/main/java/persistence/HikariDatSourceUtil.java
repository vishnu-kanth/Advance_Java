
package persistence;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariDatSourceUtil {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();

        // Database configuration
        config.setJdbcUrl("jdbc:mysql://localhost:3306/your_database");
        config.setUsername("root");
        config.setPassword("password");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");

        // HikariCP settings (optional but recommended)
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setIdleTimeout(30000);
        config.setConnectionTimeout(20000);
        config.setMaxLifetime(1800000);

        config.setPoolName("MyHikariPool");

        dataSource = new HikariDataSource(config);
    }

    // Get DataSource
    public static HikariDataSource getDataSource() {
        return dataSource;
    }

    // Close DataSource
    public static void closeDataSource() {
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
        }
    }
}
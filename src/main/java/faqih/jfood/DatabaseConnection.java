package faqih.jfood;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    /**
     * Connection connection.
     *
     * @return the connection
     */
    protected static Connection connection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/jfood",
                            "postgres", "postgres");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}

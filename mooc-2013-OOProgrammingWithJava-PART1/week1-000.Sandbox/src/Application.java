// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/jmix_db_01";
        String username = "postgres";
        String password = "postgres";
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to PostgreSQL database!");
            // Выполнять операции с базой данных здесь
        } catch (SQLException e) {
            System.out.println("Failed to obtain JDBC Connection: " + e.getMessage());
        }

    }
}


package testpostgresql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.Scanner;

public class TestPostgreSQL {

    static final String DBURL = "jdbc:postgresql://127.0.0.1:5432/jmix_db_01";
    static final String USER = "postgres";
    static final String PASS = "postgres";

    public static void main(String[] argv) throws SQLException {

        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            return;
        }

        System.out.println("PostgreSQL JDBC Driver found");
        Connection connection;

        try {
            connection = DriverManager.getConnection(DBURL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
            connection.close();
        } else {
            System.out.println("Failed to make connection to database");
            return;
        }

        TodoDao database = new TodoDao(DBURL, USER, PASS);
        Scanner scanner = new Scanner(System.in);

        new UserInterface(scanner, database).start();
        
    }
}


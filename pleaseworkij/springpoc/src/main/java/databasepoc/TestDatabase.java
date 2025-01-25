package databasepoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/world"; // URL of the database
        String user = "root"; // MySQL username
        String password = "1234"; // MySQL password
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("does this work");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

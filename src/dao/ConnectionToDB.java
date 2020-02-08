package dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionToDB {
    private static Connection connection ;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/base_medecins";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Successfully Connected on PORT 8019");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        return connection;
    }

}

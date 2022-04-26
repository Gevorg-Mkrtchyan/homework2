package Creational_DP_HMW.Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static DbConnect dbConnect;
    private final Connection connection;

    private DbConnect() {
        try {
            String url = "jdbc:mysql://localhost:3306/airport";
            String password = "qwerty33";
            String userName = "root";
            this.connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConnection() {
        return connection;
    }

    public static DbConnect getDbConnect() {
        if (dbConnect == null) {
            dbConnect = new DbConnect();
        }
        return dbConnect;
    }
}



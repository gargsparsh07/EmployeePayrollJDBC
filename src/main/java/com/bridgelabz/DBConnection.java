package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        System.out.println("Database Connection Successful");

        return connection;
    }
}
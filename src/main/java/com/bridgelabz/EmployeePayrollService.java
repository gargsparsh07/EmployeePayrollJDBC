package com.bridgelabz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeePayrollService {

    public void readEmployeeData() {

        String query = "SELECT * FROM employee_payroll";

        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");

                EmployeePayrollData employee =
                        new EmployeePayrollData(id, name, salary);

                System.out.println(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
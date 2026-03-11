package com.bridgelabz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;   // ADD THIS IMPORT

public class EmployeePayrollService {

    // UC2 METHOD
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

    // UC3 METHOD
    public void updateEmployeeSalary(String name, double salary) {

        String query = "UPDATE employee_payroll SET salary = ? WHERE name = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setDouble(1, salary);
            preparedStatement.setString(2, name);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Rows updated: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getEmployeesByDateRange(String startDate, String endDate) {

        String query = "SELECT * FROM employee_payroll WHERE start BETWEEN ? AND ?";

        try (Connection connection = DBConnection.getConnection();
             java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, startDate);
            preparedStatement.setString(2, endDate);

            ResultSet resultSet = preparedStatement.executeQuery();

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
    public void getSalaryStatisticsByGender() {

        String query = "SELECT gender, SUM(salary), AVG(salary), MIN(salary), MAX(salary), COUNT(*) FROM employee_payroll GROUP BY gender";

        try (Connection connection = DBConnection.getConnection();
             java.sql.Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {

                String gender = resultSet.getString(1);
                double sumSalary = resultSet.getDouble(2);
                double avgSalary = resultSet.getDouble(3);
                double minSalary = resultSet.getDouble(4);
                double maxSalary = resultSet.getDouble(5);
                int count = resultSet.getInt(6);

                System.out.println("Gender: " + gender);
                System.out.println("Total Salary: " + sumSalary);
                System.out.println("Average Salary: " + avgSalary);
                System.out.println("Minimum Salary: " + minSalary);
                System.out.println("Maximum Salary: " + maxSalary);
                System.out.println("Employee Count: " + count);
                System.out.println("------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addEmployee(String name, double salary, String gender, String startDate) {

        String query = "INSERT INTO employee_payroll (name, salary, gender, start) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             java.sql.PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, salary);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, startDate);

            int rowsInserted = preparedStatement.executeUpdate();

            System.out.println("Employee added successfully. Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
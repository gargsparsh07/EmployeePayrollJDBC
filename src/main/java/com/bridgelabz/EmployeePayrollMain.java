package com.bridgelabz;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        service.addEmployee("Rahul", 3500000, "M", "2023-01-10");

        service.readEmployeeData();
    }
}
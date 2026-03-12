package com.bridgelabz;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        System.out.println("UC12 - Retrieve Employee Department");

        EmployeePayrollService service = new EmployeePayrollService();

        service.getEmployeeDepartment();
    }
}
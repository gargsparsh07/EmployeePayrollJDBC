package com.bridgelabz;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        service.getEmployeesByDateRange("2018-01-01", "2022-12-31");
    }
}
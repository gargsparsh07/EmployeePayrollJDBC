package com.bridgelabz;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        System.out.println("UC7 - Salary Statistics by Gender");

        EmployeePayrollService service = new EmployeePayrollService();

        service.getSalaryStatisticsByGender();
    }
}
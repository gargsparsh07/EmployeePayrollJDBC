package com.bridgelabz;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        service.updateEmployeeSalary("Terisa", 4000000);

        service.readEmployeeData();
    }
}
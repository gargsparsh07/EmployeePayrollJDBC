# Employee Payroll JDBC Project

## Project Description

This project demonstrates the implementation of an **Employee Payroll System using Java JDBC and MySQL**.
The application connects to a MySQL database using JDBC and performs various **database operations such as Create, Read, Update, and Aggregate queries**.

The project is developed as a **Maven project** and follows a **Use Case–based development approach**, where each feature is implemented in a separate Git branch and later merged into the development branch.

The application uses **JDBC DriverManager** to establish database connections and **PreparedStatement/Statement** for executing SQL queries.

---

## Technologies Used

* Java (JDK 8 or above)
* JDBC
* MySQL
* Maven
* IntelliJ IDEA
* Git & GitHub

---

## Project Structure

```
EmployeePayrollJDBC
│
├── src
│   └── main
│       └── java
│           └── com.bridgelabz
│               ├── DBConnection.java
│               ├── EmployeePayrollData.java
│               ├── EmployeePayrollService.java
│               └── EmployeePayrollMain.java
│
├── pom.xml
└── README.md
```

---

## Maven Dependency

The project uses **MySQL Connector/J** for JDBC connectivity.

```
<dependencies>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>
```

---

## Database Setup

### Step 1: Create Database

Run the following command in MySQL:

```
CREATE DATABASE payroll_service;
USE payroll_service;
```

---

### Step 2: Create Employee Payroll Table

```
CREATE TABLE employee_payroll (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE,
    gender CHAR(1),
    start DATE
);
```

---

### Step 3: Insert Sample Data

```
INSERT INTO employee_payroll (name, salary, gender, start)
VALUES
('Terisa', 4000000, 'F', '2018-01-03'),
('Charlie', 2500000, 'M', '2019-11-13'),
('Bill', 3000000, 'M', '2020-05-21');
```

---

## Implemented Use Cases

### UC1 – Database Connection

Establish connection to MySQL database using JDBC.

### UC2 – Retrieve Employee Data

Retrieve employee payroll data from the database.

### UC3 – Update Employee Salary

Update salary of an employee using JDBC.

### UC4 – Retrieve Employees by Date Range

Retrieve employees whose start date falls within a specific range.

### UC5 – Salary Aggregation

Calculate salary statistics such as **SUM, AVG, MIN, MAX, COUNT** grouped by gender.

### UC6 – Add New Employee

Insert a new employee record into the database.

### UC7 – Salary Statistics by Gender

Compute salary statistics grouped by employee gender.

### UC8 – Extend Employee Table

Extend employee table with additional attributes.

### UC9 – Add Payroll Columns

Add payroll related attributes such as deductions and net pay.

### UC10 – Insert Employee Payroll Data

Insert additional payroll records into the database.

### UC11 – Implement ER Model

Design the database structure using multiple related tables.

### UC12 – Retrieve Data Using ER Model

Retrieve employee and payroll data using relational queries.

---

## Running the Application

1. Clone or download the repository.
2. Open the project in **IntelliJ IDEA**.
3. Configure MySQL username and password in `DBConnection.java`.
4. Run the `EmployeePayrollMain.java` file.
5. The program will execute JDBC operations and print results to the console.

---

## Git Branching Strategy

The project follows a **feature branch workflow**.

Branches used:

```
main
dev
feature/UC1-DBConnection
feature/UC2-RetrieveEmployees
feature/UC3-UpdateSalary
feature/UC4-QueryByDateRange
feature/UC5-SalaryStatistics
feature/UC6-AddEmployee
feature/UC7-SalaryStatisticsByGender
```

Each use case was developed in a separate branch and later merged into the **dev branch**.

---

## Author

Sparsh
Bridgelabz Fellowship Program

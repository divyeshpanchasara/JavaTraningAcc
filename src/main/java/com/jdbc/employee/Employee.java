package com.jdbc.employee;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String role;
    private Double salary;


    public Employee(Integer employeeId, String employeeName, String role, Double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
        this.salary = salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getRole() {
        return role;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeId = " + employeeId +
                ", employeeName = '" + employeeName + '\'' +
                ", role = '" + role + '\'' +
                ", salary = " + salary +
                '}';
    }
}

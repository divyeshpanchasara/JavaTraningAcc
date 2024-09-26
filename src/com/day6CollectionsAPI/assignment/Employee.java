package com.day6CollectionsAPI.assignment;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int yearsOfExperience;
    private double salary;


    public Employee(int employeeId, String employeeName, int yearsOfExperience, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }
}

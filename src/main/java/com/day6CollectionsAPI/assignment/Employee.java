package com.day6CollectionsAPI.assignment;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
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
    // writing this logic in different java files as this a pogo/beans class
    @Override
    public int compareTo(Employee e) {
        if(this.employeeId > e.employeeId) return 1;
        else if(this.employeeId < e.employeeId) return -1;
        return 0;
    }
    //pogo : plane old java object and should not contain business logic
}

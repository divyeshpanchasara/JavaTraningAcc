package com.day6CollectionsAPI.assignment;

import java.util.ArrayList;

public class EmployeeTester {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            employees.add(new Employee(1, "defaultEmp", 2, 250000));
        }
        EmployeeService employeeService = new EmployeeService();
        employeeService.display(employees);
    }
}

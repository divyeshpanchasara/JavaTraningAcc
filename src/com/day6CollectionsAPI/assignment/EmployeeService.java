package com.day6CollectionsAPI.assignment;

import java.util.ArrayList;

public class EmployeeService {

    public void display(ArrayList<Employee> employees){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}

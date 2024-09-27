package com.day6CollectionsAPI.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeTester {
    private static ArrayList<Employee> generateRandomEmployees(int size){
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i = 0; i < size; i++){
            int id = (int)(Math.random() * 12345667);
            String empName = "defaultEmp@" + id;
            /*
            * constructor signature
            * Employee(id, name, experience, salary)
            * */
            employees.add(new Employee(id, empName, (int)(Math.random() * 12), (int)(Math.random() * 1239030)));
        }
        System.out.printf("Generated %d Employees\n",size);
        return employees;
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter how many employees to be generated : \b");
        ArrayList<Employee> employees = generateRandomEmployees(sc.nextInt());


        EmployeeService employeeService = new EmployeeService();
//        after sorting
//        Collections.sort(employees);
//        or
//        Collections.sort(employees,
//                new Comparator<Employee>() {
//                    @Override
//                    public int compare(Employee o1, Employee o2) {
//                        if(o1.getEmployeeId() < o2.getEmployeeId()) return 1;
//                        else if(o1.getEmployeeId() > o2.getEmployeeId()) return -1;
//                        return 0;
//                    }
//                }
//        );

//        or
//        Collections.sort(employees,
//                (o1, o2) -> {
//                        if(o1.getEmployeeId() < o2.getEmployeeId()) return -1;
//                        else if(o1.getEmployeeId() > o2.getEmployeeId()) return 1;
//                        return 0;
//                }
//        );
        employeeService.display(employees);

        sc.close();
    }
}

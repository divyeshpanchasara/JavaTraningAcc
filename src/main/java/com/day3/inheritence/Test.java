package com.day3.inheritence;

public class Test {
    public static void main(String[] args) {
        Employee employeeTwo = new Employee("Divyesh", "Panchasara", 22, 123456, 5, 999999999);
        Manager manager = new Manager(employeeTwo);
        manager.setNumberOfReportees(2);
        System.out.println(manager.getFirstName());
        System.out.println(manager);
        manager.setNumberOfReportees(100);
        System.out.println(manager.getNumberOfReportees());
    }
}

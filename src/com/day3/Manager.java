package com.day3;

public class Manager extends Employee{
    private int numberOfReportees;

    public Manager(String firstName, String lastName, int age, int empId, int preformanceRating, double salary, int numberOfReportees) {
        super(firstName, lastName, age, empId, preformanceRating, salary);
        this.numberOfReportees = numberOfReportees;
    }

    public Manager(Employee e) {
        super(e.getFirstName(), e.getLastName(), e.getAge(), e.getEmpId(), e.getPreformanceRating(), e.getSalary());
    }

    public int getNumberOfReportees() {
        return numberOfReportees;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "numberOfReportees=" + numberOfReportees +
                '}';
    }
}

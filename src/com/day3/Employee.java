package com.day3;

public class Employee extends Person{
    private int empId,
                preformanceRating;
    private double salary;

    public Employee(String firstName, String lastName, int age, int empId, int preformanceRating, double salary) {
        super(firstName, lastName, age);
        this.empId = empId;
        this.preformanceRating = preformanceRating;
        this.salary = salary;
    }

    public Employee() {
        super();
    }


    @Override
    public String toString() {
        return super.toString() +
                " Employee{" +
                "empId=" + empId +
                ", preformanceRating=" + preformanceRating +
                ", salary=" + salary +
                '}';
    }

    public int getPreformanceRating() {
        return preformanceRating;
    }

    public void setPreformanceRating(int preformanceRating) {
        this.preformanceRating = preformanceRating;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

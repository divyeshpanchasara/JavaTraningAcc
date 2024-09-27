package com.day7CollectionsAPI.assignment.comparable.course;

public class Course implements Comparable<Course>{
    private int courseId;
    private String courseName;
    private int courseDurationInHours;
    private int courseFee;

    public Course(String courseName, int courseId, int courseDurationInHours, int courseFee) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseDurationInHours = courseDurationInHours;
        this.courseFee = courseFee;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseDurationInHours() {
        return courseDurationInHours;
    }

    public int getCourseFee() {
        return courseFee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDurationInHours=" + courseDurationInHours +
                ", courseFee=" + courseFee +
                '}';
    }

    @Override
    public int compareTo(Course c) {
        if(this.courseFee < c.courseFee) return -1;
        else if(this.courseFee > c.courseFee) return 1;
        return 0;
    }
}

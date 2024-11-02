package com.day7CollectionsAPI.assignment.comparator.course;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testConstructor_WithParameters() {
        String courseName = "Java Programming";
        int courseId = 101;
        int courseDurationInHours = 40;
        int courseFee = 500;

        Course course = new Course(courseName, courseId, courseDurationInHours, courseFee);

        assertEquals(courseName, course.getCourseName());
        assertEquals(courseId, course.getCourseId());
        assertEquals(courseDurationInHours, course.getCourseDurationInHours());
        assertEquals(courseFee, course.getCourseFee());
    }

    @Test
    void testGetCourseId() {
        int courseId = 102;
        Course course = new Course("Python Programming", courseId, 50, 600);
        assertEquals(courseId, course.getCourseId());
    }

    @Test
    void testGetCourseName() {
        String courseName = "Data Structures";
        Course course = new Course(courseName, 103, 45, 700);
        assertEquals(courseName, course.getCourseName());
    }

    @Test
    void testGetCourseDurationInHours() {
        int courseDurationInHours = 60;
        Course course = new Course("Algorithms", 104, courseDurationInHours, 800);
        assertEquals(courseDurationInHours, course.getCourseDurationInHours());
    }

    @Test
    void testGetCourseFee() {
        int courseFee = 900;
        Course course = new Course("Operating Systems", 105, 70, courseFee);
        assertEquals(courseFee, course.getCourseFee());
    }

    @Test
    void testToString() {
        String courseName = "Machine Learning";
        int courseId = 106;
        int courseDurationInHours = 80;
        int courseFee = 1000;

        Course course = new Course(courseName, courseId, courseDurationInHours, courseFee);
        String expectedString = "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDurationInHours=" + courseDurationInHours +
                ", courseFee=" + courseFee +
                '}';

        assertEquals(expectedString, course.toString());
    }
}
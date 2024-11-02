package com.day7CollectionsAPI.assignment.comparator.courseService;

import com.day7CollectionsAPI.assignment.comparator.course.Course;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @Test
    void testGenerateCourse() {
        Course course = CourseService.generateCourse();
        assertNotNull(course, "The generated course should not be null");
        assertNotNull(course.getCourseName(), "The course name should not be null");
        assertTrue(course.getCourseId() >= 0, "The course ID should be non-negative");
        assertTrue(course.getCourseDurationInHours() >= 0, "The course duration should be non-negative");
        assertTrue(course.getCourseFee() >= 0, "The course fee should be non-negative");
    }

    @Test
    void testGenerateCourses() {
        int size = 5;
        List<Course> courses = CourseService.generateCourses(size);
        assertNotNull(courses, "The generated course list should not be null");
        assertEquals(size, courses.size(), "The course list size should match the requested size");
    }

    @Test
    void testPrintSortByFees() {
        List<Course> courses = CourseService.generateCourses(5);
        CourseService.printSortByFees(courses);

        // Check if the list is sorted by fees
        for (int i = 1; i < courses.size(); i++) {
            assertTrue(
                    courses.get(i - 1).getCourseFee() <= courses.get(i).getCourseFee(),
                    "The courses should be sorted in ascending order of fees"
            );
        }
    }

    @Test
    void testPrintSortByName() {
        List<Course> courses = CourseService.generateCourses(5);
        CourseService.printSortByName(courses);

        // Check if the list is sorted by name
        for (int i = 1; i < courses.size(); i++) {
            assertTrue(
                    courses.get(i - 1).getCourseName().compareTo(courses.get(i).getCourseName()) <= 0,
                    "The courses should be sorted in ascending order of names"
            );
        }
    }

    @Test
    void testPrintSortByDuration() {
        List<Course> courses = CourseService.generateCourses(5);
        CourseService.printSortByDuration(courses);

        // Check if the list is sorted by duration
        for (int i = 1; i < courses.size(); i++) {
            assertTrue(
                    courses.get(i - 1).getCourseDurationInHours() <= courses.get(i).getCourseDurationInHours(),
                    "The courses should be sorted in ascending order of duration"
            );
        }
    }
}

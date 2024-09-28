package com.day7CollectionsAPI.assignment.comparator.courseComparatorTest;

import com.day7CollectionsAPI.assignment.comparator.course.Course;

import java.util.List;

import static com.day7CollectionsAPI.assignment.comparator.courseService.CourseService.*;


public class CourseComparatorTest {
    public static void main(String[] args) {
        List<Course> courseList = generateCourses(100);
        printSortByFees(courseList);
    }
}

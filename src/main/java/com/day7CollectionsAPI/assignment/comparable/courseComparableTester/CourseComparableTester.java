package com.day7CollectionsAPI.assignment.comparable.courseComparableTester;

import com.day7CollectionsAPI.assignment.comparable.course.Course;
import static com.day7CollectionsAPI.assignment.comparable.courseService.CourseService.*;
import java.util.List;

public class CourseComparableTester {
    public static void main(String[] args) {
        List<Course> courseList = generateCourses(50);
        printAllCoursesSorted(courseList);
    }
}

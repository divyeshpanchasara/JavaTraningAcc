package com.day7CollectionsAPI.assignment.comparable.courseService;

import com.day7CollectionsAPI.assignment.comparable.course.Course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseService {
    private static String string = "abcdefghijklmnopqrstuvwxyz";
    public static Course generateCourse(){
//        String courseName, int courseId, int courseDurationInHours, int courseFee
        int start = (int)(Math.random() * 12) % string.length();
        return new Course(
                string.substring(start, (start + 4) % string.length()),
                (int)(Math.random() * 6126),
                (int)(Math.random() * 13),
                (int)(Math.random() * 1626)
        );
    }

    public static List<Course> generateCourses(int size){
        List<Course> courseList = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
           courseList.add(generateCourse());
        }
        return courseList;
    }

    public static void printAllCoursesSorted(List<Course> courseList){
        Collections.sort(courseList);
        courseList.forEach(
                System.out::println
        );
    }

}

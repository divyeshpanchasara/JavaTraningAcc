package com.day7CollectionsAPI.assignment.comparator.courseService;


import com.day7CollectionsAPI.assignment.comparator.SortByDurationComparator;
import com.day7CollectionsAPI.assignment.comparator.SortByFeesComparator;
import com.day7CollectionsAPI.assignment.comparator.SortByNameComparator;
import com.day7CollectionsAPI.assignment.comparator.course.Course;

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

    public static void printSortByFees(List<Course> courseList){
        System.out.println("Sorting by Course Fees....");
        Collections.sort(courseList, new SortByFeesComparator());
        courseList.forEach(
                course -> {
                    System.out.println(course);
                }
        );
    }




    public static void printSortByName(List<Course> courseList){
        System.out.println("Sorting by Course Name....");
        Collections.sort(courseList, new SortByNameComparator());
        courseList.forEach(
                course -> {
                    System.out.println(course);
                }
        );
    }
    public static void printSortByDuration(List<Course> courseList){
        System.out.println("Sorting by Course Duration....");
        Collections.sort(courseList, new SortByDurationComparator());
        courseList.forEach(
                course -> {
                    System.out.println(course);
                }
        );
    }
}

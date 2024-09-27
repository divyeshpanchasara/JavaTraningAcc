package com.day7CollectionsAPI.assignment.comparator;

import com.day7CollectionsAPI.assignment.comparator.course.Course;

import java.util.Comparator;

public class SortByFeesComparator implements Comparator<Course> {
    @Override
    public int compare(Course c1, Course c2) {
        if(c1.getCourseFee() < c2.getCourseFee()) return -1;
        else if(c1.getCourseFee() > c2.getCourseFee()) return 1;
        return 0;
    }
}

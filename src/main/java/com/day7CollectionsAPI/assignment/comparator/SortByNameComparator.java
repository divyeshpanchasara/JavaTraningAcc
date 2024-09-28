package com.day7CollectionsAPI.assignment.comparator;

import com.day7CollectionsAPI.assignment.comparator.course.Course;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Course> {

    @Override
    public int compare(Course c1, Course c2) {
        int res = c1.getCourseName().compareTo(c2.getCourseName());
        if(res < 0) return -1;
        else if(res > 0) return 1;
        return 0;
    }
}

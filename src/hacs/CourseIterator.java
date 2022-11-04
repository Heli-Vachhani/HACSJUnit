package hacs;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Heli Vachhani
 * @version 1.0
 */

import java.util.Iterator;


public class CourseIterator implements Iterator<Course> {
    private ClassCourseList theCourseList;
    private int currentCourseNumber = -1;

    public CourseIterator() {
    }

    public CourseIterator(ClassCourseList courseList) {
        theCourseList = courseList;
    }

    @Override
    public boolean hasNext() {
        return currentCourseNumber < theCourseList.size() - 1;
    }

    @Override
    public Course next() {
        if (hasNext() == true) {
            currentCourseNumber++;
            return theCourseList.get(currentCourseNumber);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        int size = theCourseList.size();
        theCourseList.remove(size - 1);
    }

    public Course next(String CourseName) {
        Course theCourse;
        theCourse = (Course) next();
        while (theCourse != null) {
            if (CourseName.compareTo(theCourse.toString()) == 0) {
                return theCourse;
            }
            theCourse = (Course) next();
        }
        return null;
    }

    public ClassCourseList getTheCourseList() {
        return theCourseList;
    }

}
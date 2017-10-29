package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Course;

public class CoursesRepository {

    private static Course[] courses = new Course[5];
    private static int numberOfCourses;

    public static void addCourse(Course course) {
        courses[numberOfCourses] = course;
        numberOfCourses++;
       
    }

    public static void removeCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (course.getID() == courses[i].getID()) {
                courses[i] = null;
            }
            courses =  (Course[]) ArrayWorker.removeEmptySpace(courses);
        }
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public static Course[] getCourses() {
        return courses;
    }

}

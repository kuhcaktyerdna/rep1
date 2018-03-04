package com.senla.course.repositories;

import com.senla.course.utils.Printer;
import com.senla.course.entities.Course;
import java.util.ArrayList;
import java.util.List;

public class CoursesRepository {

    private static final CoursesRepository COURSES_REPOSITORY = new CoursesRepository();
    private static final List<Course> COURSES = new ArrayList();

    private CoursesRepository() {
    }

    public void addCourse(Course course) {
        try {
            COURSES.add(course);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Course wasn't added.");
        }
    }

    public void addCourses(List<Course> coursesGroup) {
        try {
            COURSES.addAll(coursesGroup);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Courses weren't added.");
        }
    }

    public void removeCourse(Course course) {
        try {
            COURSES.remove(course);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Course wasn't removed.");
        }
    }

    public int getNumberOfCourses() {
        return COURSES.size();
    }

    public List<Course> getCourses() {
        return COURSES;
    }

    public static CoursesRepository getRepository() {
        return COURSES_REPOSITORY;
    }

}

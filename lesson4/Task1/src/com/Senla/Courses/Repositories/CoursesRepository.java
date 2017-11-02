package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Course;
import com.Senla.Courses.Entities.Entity;
import java.util.Arrays;

public class CoursesRepository {

    private static Course[] courses = new Course[5];
    private static int numberOfCourses = 0;
    
    public static void addCourse(Course course) {
        if (ArrayWorker.arrayIsFull(courses) == false) {
            courses[numberOfCourses] = course;
        } else {
            courses = castEntitiesArray(ArrayWorker.expandArray(courses));
            courses[numberOfCourses] = course;
        }
        numberOfCourses++;

    }

    public static void addCourses(Course[] coursesGroup) {
        for (int i = 0; i < coursesGroup.length; i++) {
            if (ArrayWorker.arrayIsFull(courses) == false) {
                courses[numberOfCourses] = coursesGroup[i];
                numberOfCourses++;
            } else {
                courses = castEntitiesArray(ArrayWorker.expandArray(courses));
                i--;
            }
        }
    }
    
    private static Course[] castEntitiesArray(Entity[] entities){
        Course[] courses = Arrays.copyOf(entities, entities.length, Course[].class);
        return courses;
    }

    public void removeCourse(Course course) {
        courses = (Course[]) ArrayWorker.remove(courses, course);
        numberOfCourses--;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public  Course[] getCourses() {
        return courses;
    }

}

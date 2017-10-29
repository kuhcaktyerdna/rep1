package com.Senla.Courses.Services;

import com.Senla.Courses.Entities.Course;
import com.Senla.Courses.Repositories.CoursesRepository;
import com.danco.training.TextFileWorker;

public class CoursesService {


    static TextFileWorker coursesTextWorker = new TextFileWorker("Courses.txt");

    public Course getCourse(Course[] courses, int ID) {
        Course neededCourse = null;
        for (int i = 0; i < courses.length - 1; i++) {
            if (courses[i].getID() == ID) {
                neededCourse = courses[i];
            }
        }
        return neededCourse;
    }


        
    

    public static String[] giveCoursesList() {
        String[] coursesList = new String[CoursesRepository.getCourses().length];
        for (int i = 0; i < CoursesRepository.getCourses().length; i++) {
            if (CoursesRepository.getCourses()[i] != null) {
                coursesList[i] = CoursesRepository.getCourses()[i].getName() + "; ID: " + CoursesRepository.getCourses()[i].getID() + "; ";
            } else {
                break;
            }
        }
        coursesTextWorker.writeToFile(coursesList);
        return coursesList;
    }
    
    public static void addCourse(Course course){
        CoursesRepository.addCourse(course);
    }
    
    public static void removeCourse(Course course){
        CoursesRepository.removeCourse(course);
    }
}

package com.Senla.Courses.Services;

import com.Senla.Courses.Comparators.Courses.StudentNumComparator;
import com.Senla.Courses.Entities.*;
import com.Senla.Courses.Printer;
import com.Senla.Courses.Repositories.CoursesRepository;
import static com.Senla.Courses.Repositories.StudentsRepository.getNumberOfStudents;
import com.danco.training.TextFileWorker;
import java.util.Arrays;

public class CoursesService {

    static TextFileWorker coursesTextWorker = new TextFileWorker("Courses.txt");
    private final CoursesRepository coursesRepository = new CoursesRepository();
    private int courseID = 1;
    
    public Course createCourse(Course course, String name, Lection[] lections, Student[] students){
        course = new Course(name, lections, students);
        course.setID(courseID);
        courseID++;
        return course;
    }

    public static Course getCourse(Course[] courses, int ID) {
        Course neededCourse = null;
        for (int i = 0; i < courses.length - 1; i++) {
            if (courses[i].getID() == ID) {
                neededCourse = courses[i];
            }
        }
        return neededCourse;
    }
    
    public Course[] getCourses(){
        return coursesRepository.getCourses();
    }
        

    public String[] giveCoursesList() {
        String[] coursesList = new String[coursesRepository.getCourses().length];
        for (int i = 0; i < coursesRepository.getCourses().length; i++) {
            if (coursesRepository.getCourses()[i] != null) {
                coursesList[i] = coursesRepository.getCourses()[i].getName() + " \n " + coursesRepository.getCourses()[i].getID() + "; ";
            } else {
                break;
            }
        }
        coursesTextWorker.writeToFile(coursesList);
        return coursesList;
    }
    
    
    public Course[] recieveCoursesList(){
        Course[] courses = new Course[coursesTextWorker.readFromFile().length/2];
        int index = 0;
        if(coursesTextWorker.readFromFile()!=null)
        {
            for(int i = 0; i<coursesTextWorker.readFromFile().length-1; i+=2){
                courses[index] = createCourse(courses[index], coursesTextWorker.readFromFile()[i], null, null);
                courses[index].setID(Integer.valueOf(coursesTextWorker.readFromFile()[i+1]));
                index++;
                }
        }
        return courses;
    }
        

    public void addCourse(Course course) {
        coursesRepository.addCourse(course);
    }
    
    public void addCourses(Course[] courses){
        coursesRepository.addCourses(courses);
    }

    public void removeCourse(Course course) {
        coursesRepository.removeCourse(course);
    }
    
    public int getNumberOfCourses(){
        return coursesRepository.getNumberOfCourses();
    }
    
    public void sort(){
    Arrays.sort(coursesRepository.getCourses(), 0, getNumberOfCourses(), new StudentNumComparator());
}}

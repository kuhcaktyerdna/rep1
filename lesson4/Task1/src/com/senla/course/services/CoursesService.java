package com.senla.course.services;

import com.senla.course.entities.Lection;
import com.senla.course.entities.Student;
import com.senla.course.entities.Course;
import com.senla.course.comparators.courses.StudentNumComparator;
import com.senla.course.repositories.CoursesRepository;
import com.danco.training.TextFileWorker;
import com.senla.course.utils.Printer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoursesService {

    static TextFileWorker coursesTextWorker = new TextFileWorker("Courses.txt");
    private int courseID = 1;
    
    public Course createCourse(Course course, String name, List<Lection> lections, List<Student> students){
        course = new Course(name, lections, students);
        course.setID(courseID);
        courseID++;
        return course;
    }

    public Course getCourse(List<Course> courses, int ID){
        return getCourse(courses, ID);
    }
    
    private  Course getCourseByID(List<Course> courses, int ID) {
        Course neededCourse = null;
        try{
            for (int i = 0; i < courses.size() - 1; i++) {
            if (courses.get(i).getID() == ID) {
                neededCourse = courses.get(i);
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Course wasn't found.");
        }
        return neededCourse;
    }
    
    public List<Course> getCourses(){
        return CoursesRepository.getRepository().getCourses();
    }
        

    public String[] giveCoursesList() {
        String[] coursesList = new String[CoursesRepository.getRepository().getCourses().size()];
        try{
            for (int i = 0; i < CoursesRepository.getRepository().getCourses().size()-1; i++) {
            if (CoursesRepository.getRepository().getCourses().isEmpty()==false){
                coursesList[i] = CoursesRepository.getRepository().getCourses().get(i).toString();
            } else {
                break;
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Wrong courses list. Courses weren't added to text file.");
        }
        coursesTextWorker.writeToFile(coursesList);
        return coursesList;
    }
    
    
    public List recieveCoursesList(){
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
        List<Course> preparedCourses = Arrays.asList(courses);
        return preparedCourses;
    }
        

    public void addCourse(Course course) {
        CoursesRepository.getRepository().addCourse(course);
    }
    
    public void addCourses(List<Course> courses){
        CoursesRepository.getRepository().addCourses(courses);
    }

    public void removeCourse(Course course) {
        CoursesRepository.getRepository().removeCourse(course);
    }
    
    public int getNumberOfCourses(){
        return CoursesRepository.getRepository().getNumberOfCourses();
    }
    
    public void sort(){
    Collections.sort(CoursesRepository.getRepository().getCourses(), new StudentNumComparator());
}}

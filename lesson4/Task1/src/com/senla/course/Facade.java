package com.senla.course;

import com.senla.course.entities.*;
import com.senla.course.services.*;
import java.util.ArrayList;
import java.util.List;

public class Facade {

    
    public static void main(String[] args) {
    
        if(args.length > 0){ 
        System.out.println(args[0]);
        CoursesService coursesService = new CoursesService();
        LectionsService lectionsService = new LectionsService();
        LectorsService lectorService = new LectorsService();
        StudentsService studentsService = new StudentsService();
        List<Course> courses = coursesService.recieveCoursesList();
        List<Lection> lections = lectionsService.recieveLectionsList();
        List<Lector> lectors = lectorService.recieveLectorsList();
        List<Student> students = studentsService.recieveStudentsList();
        coursesService.addCourses(courses);
        System.out.println(coursesService.getCourses().get(0).getID());
        System.out.println(coursesService.getCourses().size());
        lectionsService.addLections(lections);
        System.out.println(lectionsService.getLections().get(0).getID());
        System.out.println(lectionsService.getLections().size());
        lectorService.addLectors(lectors);
        System.out.println(lectorService.getLectors().get(0).getID());
        System.out.println(lectorService.getLectors().size());
        studentsService.addStudents(students);
        System.out.println(studentsService.getStudents().get(0).getID());
        System.out.println(studentsService.getStudents().size());
        
        } else {  
        Facade.main();
        }
    }
    
    
    public static void main() {
        List<Student> group1 = new ArrayList(10);
        List<Student> group2 = new ArrayList(9);
        StudentsService studentsService = new StudentsService();
        Student student = null;
        group1.add(studentsService.registerStudent(student, "JStudent 1.1"));
        group1.add(studentsService.registerStudent(student, "IStudent 1.2"));
        group1.add(studentsService.registerStudent(student, "HStudent 1.3"));
        group1.add(studentsService.registerStudent(student, "GStudent 1.4"));
        group1.add(studentsService.registerStudent(student, "FStudent 1.5"));
        group1.add(studentsService.registerStudent(student, "EStudent 1.6"));
        group1.add(studentsService.registerStudent(student, "DStudent 1.7"));
        group1.add(studentsService.registerStudent(student, "CStudent 1.8"));
        group1.add(studentsService.registerStudent(student, "Bstudent 1.9"));
        group1.add(studentsService.registerStudent(student, "AStudent 1.10"));
        for(Student o: group1)
        System.out.println(o);
        studentsService.giveStudentsList();
        group2.add(studentsService.registerStudent(student, "JStudent 2.1"));
        group2.add(studentsService.registerStudent(student, "KStudent 2.2"));
        group2.add(studentsService.registerStudent(student, "LStudent 2.3"));
        group2.add(studentsService.registerStudent(student, "MStudent 2.4"));
        group2.add(studentsService.registerStudent(student, "NStudent 2.5"));
        group2.add(studentsService.registerStudent(student, "OStudent 2.6"));
        group2.add(studentsService.registerStudent(student, "PStudent 2.7"));
        group2.add(studentsService.registerStudent(student, "WStudent 2.8"));
        group2.add(studentsService.registerStudent(student, "YStudent 2.9"));
        studentsService.addStudents(group2);
        studentsService.addStudents(group1);
        studentsService.removeStudent(group2.get(0));
        studentsService.removeStudent(group2.get(5));
        System.out.println(studentsService.getStudents().get(6).getName());
        System.out.println(studentsService.getStudents().get(3).getName());
        studentsService.sort();
        System.out.println(studentsService.getStudents().get(0).getName());
        studentsService.giveStudentsList();
        
        LectionsService lectionsService = new LectionsService();
        Lection lection = null;
        List<Lection> firstCourseLections = new ArrayList();
        List<Lection> secondCourseLections = new ArrayList();
        firstCourseLections.add(lectionsService.createLection(lection, "Anathomy"));
        firstCourseLections.get(0).setDate(9, 29, 15, 5);
        firstCourseLections.add(lectionsService.createLection(lection, "Mathematics"));
        firstCourseLections.get(1).setDate(9, 29, 11, 40);
        firstCourseLections.add(lectionsService.createLection(lection, "PE"));
        firstCourseLections.get(2).setDate(9, 29, 10, 5);
        firstCourseLections.add(lectionsService.createLection(lection, "Economics"));
        firstCourseLections.get(3).setDate(9, 29, 13, 30);
        firstCourseLections.add(lectionsService.createLection(lection, "History"));
        firstCourseLections.get(4).setDate(9, 29, 8, 30);
        secondCourseLections.add(lectionsService.createLection(lection, "Physics"));
        secondCourseLections.get(0).setDate(9, 29, 15, 5);
        secondCourseLections.add(lectionsService.createLection(lection, "Chemistry"));
        secondCourseLections.get(1).setDate(9, 29, 11, 40);
        secondCourseLections.add(lectionsService.createLection(lection, "PE"));
        secondCourseLections.get(2).setDate(9, 29, 10, 5);
        secondCourseLections.add(lectionsService.createLection(lection, "Geograpy"));
        secondCourseLections.get(3).setDate(9, 29, 13, 30);
        secondCourseLections.add(lectionsService.createLection(lection, "Grammar"));
        secondCourseLections.get(4).setDate(9, 29, 8, 30);
        lectionsService.addLections(firstCourseLections);
        lectionsService.addLections(secondCourseLections);
        lectionsService.giveLectionsList();
        
        CoursesService coursesService = new CoursesService();
        Course firstCourse = null;
        firstCourse = coursesService.createCourse(firstCourse,"First course", firstCourseLections, group1);
        Course secondCourse = null;
        secondCourse = coursesService.createCourse(secondCourse, "Second course", secondCourseLections, group2);
        coursesService.addCourse(firstCourse);
        coursesService.addCourse(secondCourse);
        coursesService.sort();
        coursesService.giveCoursesList();
        
        LectorsService lectorsService = new LectorsService();
        Lector firstCourseLector = null;
        firstCourseLector= lectorsService.registerLector(firstCourseLector,"qLector 1", firstCourseLections.get(0));
        Lector secondCourseLector = null; 
        secondCourseLector = lectorsService.registerLector(secondCourseLector,"aLector 2", secondCourseLections.get(0));
        lectorsService.addLector(firstCourseLector);
        lectorsService.addLector(secondCourseLector);
        lectorsService.sort();
        lectorsService.giveLectorsList();
        for(Student s: group2)
            System.out.println(s);
        
    }
}

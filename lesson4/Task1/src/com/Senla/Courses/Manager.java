package com.Senla.Courses;

import com.Senla.Courses.Entities.*;
import com.Senla.Courses.Services.*;

public class Manager {

    
    public static void main(String[] args) {
    
        if(args.length > 0){ 
        System.out.println(args[0]);
        CoursesService coursesService = new CoursesService();
        LectionsService lectionsService = new LectionsService();
        LectorsService lectorService = new LectorsService();
        StudentsService studentsService = new StudentsService();
        Course[] courses = coursesService.recieveCoursesList();
        Lection[] lections = lectionsService.recieveLectionsList();
        Lector[] lectors = lectorService.recieveLectorsList();
        Student[] students = studentsService.recieveStudentsList();
        coursesService.addCourses(courses);
        lectionsService.addLections(lections);
        lectorService.addLectors(lectors);
        studentsService.addStudents(students);
        
        } else {  
        Manager.main();
        }
    }
    
    
    public static void main() {
        Student[] group1 = new Student[10];
        Student[] group2 = new Student[9];
        StudentsService studentsService = new StudentsService();
        group1[0] = studentsService.registerStudent(group1[0], "JStudent 1.1");
        group1[1] = studentsService.registerStudent(group1[1], "IStudent 1.2");
        group1[2] = studentsService.registerStudent(group1[2], "HStudent 1.3");
        group1[3] = studentsService.registerStudent(group1[3], "GStudent 1.4");
        group1[4] = studentsService.registerStudent(group1[4], "FStudent 1.5");
        group1[5] = studentsService.registerStudent(group1[5], "EStudent 1.6");
        group1[6] = studentsService.registerStudent(group1[6], "DStudent 1.7");
        group1[7] = studentsService.registerStudent(group1[7], "CStudent 1.8");
        group1[8] = studentsService.registerStudent(group1[8], "Bstudent 1.9");
        group1[9] = studentsService.registerStudent(group1[9], "AStudent 1.10");
        group2[0] = studentsService.registerStudent(group2[0], "JStudent 2.1");
        group2[1] = studentsService.registerStudent(group2[1], "KStudent 2.2");
        group2[2] = studentsService.registerStudent(group2[2], "LStudent 2.3");
        group2[3] = studentsService.registerStudent(group2[3], "MStudent 2.4");
        group2[4] = studentsService.registerStudent(group2[4], "NStudent 2.5");
        group2[5] = studentsService.registerStudent(group2[5], "OStudent 2.6");
        group2[6] = studentsService.registerStudent(group2[6], "PStudent 2.7");
        group2[7] = studentsService.registerStudent(group2[7], "WStudent 2.8");
        group2[8] = studentsService.registerStudent(group2[8], "YStudent 2.9");
        studentsService.addStudents(group2);
        studentsService.addStudents(group1);
        studentsService.removeStudent(group2[0]);
        studentsService.removeStudent(group2[5]);
        System.out.println(studentsService.getStudents()[6].getName());
        System.out.println(studentsService.getStudents()[3].getName());
        studentsService.sort();
        System.out.println(studentsService.getStudents()[0].getName());
        studentsService.giveStudentsList();
        
        LectionsService lectionsService = new LectionsService();
        Lection[] firstCourseLections = new Lection[5];
        Lection[] secondCourseLections = new Lection[5];
        firstCourseLections[0] = lectionsService.createLection(firstCourseLections[0], "Anathomy");
        firstCourseLections[0].setDate(9, 29, 15, 5);
        firstCourseLections[1] = lectionsService.createLection(firstCourseLections[1],"Mathematics");
        firstCourseLections[1].setDate(9, 29, 11, 40);
        firstCourseLections[2] = lectionsService.createLection(firstCourseLections[2],"PE");
        firstCourseLections[2].setDate(9, 29, 10, 5);
        firstCourseLections[3] = lectionsService.createLection(firstCourseLections[3],"Economics");
        firstCourseLections[3].setDate(9, 29, 13, 30);
        firstCourseLections[4] =lectionsService.createLection(firstCourseLections[4],"History");
        firstCourseLections[4].setDate(9, 29, 8, 30);
        secondCourseLections[0] =lectionsService.createLection(secondCourseLections[0],"Physics");
        secondCourseLections[0].setDate(9, 29, 15, 5);
        secondCourseLections[1] =lectionsService.createLection(secondCourseLections[1],"Chemistry");
        secondCourseLections[1].setDate(9, 29, 11, 40);
        secondCourseLections[2] = lectionsService.createLection(secondCourseLections[2],"PE");
        secondCourseLections[2].setDate(9, 29, 10, 5);
        secondCourseLections[3] =lectionsService.createLection(secondCourseLections[3],"Geograpy");
        secondCourseLections[3].setDate(9, 29, 13, 30);
        secondCourseLections[4] = lectionsService.createLection(secondCourseLections[4],"Grammar");
        secondCourseLections[4].setDate(9, 29, 8, 30);
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
        firstCourseLector= lectorsService.registerLector(firstCourseLector,"qLector 1", firstCourseLections[0]);
        Lector secondCourseLector = null; 
        secondCourseLector = lectorsService.registerLector(secondCourseLector,"aLector 2", secondCourseLections[0]);
        lectorsService.addLector(firstCourseLector);
        lectorsService.addLector(secondCourseLector);
        lectorsService.sort();
        lectorsService.giveLectorsList();
        Printer.printArray(group2);
        
    }
}

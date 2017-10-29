package com.Senla.Courses;

import com.Senla.Courses.Entities.*;
import com.Senla.Courses.Services.*;

public class Manager {

    public static void main(String args[]) {
        Student[] group1 = new Student[10];
        Student[] group2 = new Student[10];
        group1[0] = StudentsService.registerStudent(group1[0], "Student 1.1");
        group1[1] = StudentsService.registerStudent(group1[1], "Student 1.2");
        group1[2] = StudentsService.registerStudent(group1[2], "Student 1.3");
        group1[3] = StudentsService.registerStudent(group1[3], "Student 1.4");
        group1[4] = StudentsService.registerStudent(group1[4], "Student 1.5");
        group1[5] = StudentsService.registerStudent(group1[5], "Student 1.6");
        group1[6] = StudentsService.registerStudent(group1[6], "Student 1.7");
        group1[7] = StudentsService.registerStudent(group1[7], "Student 1.8");
        group1[8] = StudentsService.registerStudent(group1[8], "Student 1.9");
        group1[9] = StudentsService.registerStudent(group1[9], "Student 1.10");
        group2[0] = StudentsService.registerStudent(group2[0], "Student 2.1");
        group2[1] = StudentsService.registerStudent(group2[1], "Student 2.2");
        group2[2] = StudentsService.registerStudent(group2[2], "Student 2.3");
        group2[3] = StudentsService.registerStudent(group2[3], "Student 2.4");
        group2[4] = StudentsService.registerStudent(group2[4], "Student 2.5");
        group2[5] = StudentsService.registerStudent(group2[5], "Student 2.6");
        group2[6] = StudentsService.registerStudent(group2[6], "Student 2.7");
        group2[7] = StudentsService.registerStudent(group2[7], "Student 2.8");
        group2[8] = StudentsService.registerStudent(group2[8], "Student 2.9");
        group2[9] = StudentsService.registerStudent(group2[9], "Student 2.10");
        Lection[] firstCourseLections = new Lection[5];
        Lection[] secondCourseLections = new Lection[5];
        firstCourseLections[0] = new Lection("Anathomy");
        firstCourseLections[0].setDate(9, 29, 15, 5);
        firstCourseLections[1] = new Lection("Mathematics");
        firstCourseLections[1].setDate(9, 29, 11, 40);
        firstCourseLections[2] = new Lection("PE");
        firstCourseLections[2].setDate(9, 29, 10, 5);
        firstCourseLections[3] = new Lection("Economics");
        firstCourseLections[3].setDate(9, 29, 13, 30);
        firstCourseLections[4] = new Lection("History");
        firstCourseLections[4].setDate(9, 29, 8, 30);
        secondCourseLections[0] = new Lection("Physics");
        secondCourseLections[0].setDate(9, 29, 15, 5);
        secondCourseLections[1] = new Lection("Chemistry");
        secondCourseLections[1].setDate(9, 29, 11, 40);
        secondCourseLections[2] = new Lection("PE");
        secondCourseLections[2].setDate(9, 29, 10, 5);
        secondCourseLections[3] = new Lection("Geograpy");
        secondCourseLections[3].setDate(9, 29, 13, 30);
        secondCourseLections[4] = new Lection("Grammar");
        secondCourseLections[4].setDate(9, 29, 8, 30);
        Course firstCourse = new Course("First course", firstCourseLections, group1);
        Course secondCourse = new Course("Second course", secondCourseLections, group2);
        Lector firstCourseLector = new Lector("Lector 1", firstCourseLections[0]);
        Lector secondCourseLector = new Lector("Lector 2", secondCourseLections[0]);
        LectionsService.addLections(firstCourseLections);
        LectionsService.addLections(secondCourseLections);
        CoursesService.addCourse(firstCourse);
        CoursesService.addCourse(secondCourse);
        LectorsService.addLector(firstCourseLector);
        StudentsService.addStudents(group1);
        StudentsService.addStudents(group2);
        System.out.println(StudentsService.getStudentNumber());
    }
}

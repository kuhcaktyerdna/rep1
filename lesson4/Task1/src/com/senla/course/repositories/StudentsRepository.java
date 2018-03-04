package com.senla.course.repositories;

import com.senla.course.utils.Printer;
import com.senla.course.entities.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

    private static final StudentsRepository STUDENTS_REPOSITORY = new StudentsRepository();
    private static final List<Student> STUDENTS = new ArrayList();
    
    private StudentsRepository(){}

    public void addStudent(Student student) {
        try{
            STUDENTS.add(student);
        }catch(ArrayIndexOutOfBoundsException e){
            Printer.print("Error. Student wasn't added.");
        }
    }

    public  void addStudents(List<Student> group) {
        try{
            STUDENTS.addAll(group);
        }catch(ArrayIndexOutOfBoundsException e){
            Printer.print("Error. Students weren't added.");
        }
    }

    public void removeStudent(Student student) {
        try{
            STUDENTS.remove(student);
        }catch(ArrayIndexOutOfBoundsException e){
            Printer.print("Error. Student wasn't removed");
        }
    }

    public List<Student> getStudents() {
        return STUDENTS;
    }

    public static int getNumberOfStudents() {
        return STUDENTS.size();
    }
    
    public static StudentsRepository getRepository(){
        return STUDENTS_REPOSITORY;
    }

}

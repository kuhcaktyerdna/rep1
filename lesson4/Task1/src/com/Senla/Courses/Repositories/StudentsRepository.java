package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Entity;
import com.Senla.Courses.Entities.Student;
import java.util.Arrays;

public class StudentsRepository {

    private static Student[] students = new Student[10];
    private static int numberOfStudents = 0;
    
public static void addStudent(Student student) {
        if (ArrayWorker.arrayIsFull(students) == false) {
            students[numberOfStudents] = student;
        } else {
            students = castEntitiesArray((Student[]) ArrayWorker.expandArray(students));
            students[numberOfStudents] = student;
        }
        numberOfStudents++;

    }

    private static Student[] castEntitiesArray(Entity[] entities){
        Student[] students = Arrays.copyOf(entities, entities.length, Student[].class);
        return students;
    }

    public static void addStudents(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            if (ArrayWorker.arrayIsFull(students) == false) {
                students[numberOfStudents] = group[i];
                numberOfStudents++;
            } else {
                students = castEntitiesArray(ArrayWorker.expandArray(students));
                i--;
            }
        }
    }

    public void removeStudent(Student student) {
        students = (Student[]) ArrayWorker.remove(students, student);
        numberOfStudents--;
    }

    public Student[] getStudents() {
        return students;
    }
    
    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

}

package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Student;

public class StudentsRepository {

    private static Student[] students = new Student[10];
    private static int numberOfStudents = 0;

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void addStudent(Student student) {
        if (ArrayWorker.arrayIsFull(students) == false) {
            students[numberOfStudents] = student;
        } else {
            ArrayWorker.expandArray(students);
        }
        numberOfStudents++;

    }

    public static void addStudents(Student[] group) {
        for (int i = 0; i < group.length; i++) {
            if (ArrayWorker.arrayIsFull(students) == false) {
                students[numberOfStudents] = group[i];
                numberOfStudents++;
            } else {
                students = ArrayWorker.expandArray(students);
                i--;
            }
        }
    }

    public static void removeStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (student.getID() == students[i].getID()) {
                students[i] = null;
            }
            students = (Student[]) ArrayWorker.removeEmptySpace(students);
        }
    }

    public static Student[] getStudents() {
        return students;
    }
}

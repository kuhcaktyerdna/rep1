package com.Senla.Courses.Services;

import com.Senla.Courses.Entities.Student;
import com.Senla.Courses.Repositories.StudentsRepository;
import com.danco.training.TextFileWorker;

public class StudentsService {

    private static int ID = 1;
    private static TextFileWorker textWriter = new TextFileWorker("Students.txt");

    public static Student getStudent(Student[] students, int ID) {
        Student neededStudent = getStudentByID(students, ID);
        return neededStudent;
    }

    private static Student getStudentByID(Student[] students, int ID) {
        Student neededStudent = null;
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i].getID() == ID) {
                neededStudent = students[i];
            }
        }
        return neededStudent;
    }

    public static String[] giveStudentsList() {
        String[] studentsList = new String[StudentsRepository.getStudents().length];
        for (int i = 0; i < StudentsRepository.getStudents().length; i++) {
            if (StudentsRepository.getStudents()[i] != null) {
                studentsList[i] = StudentsRepository.getStudents()[i].getName() +"; ID: "+StudentsRepository.getStudents()[i].getID();
            } else {
                break;
            }
        }
        textWriter.writeToFile(studentsList);
        return studentsList;
    }

    public static Student registerStudent(Student student, String name) {
        student = new Student(name);
        student.setID((ID * 100) + 11);
        ID++;
        return student;
    }

    public static void addStudent(Student student){
        StudentsRepository.addStudent(student);
    } 
    
    public static void addStudents(Student[] group){
        StudentsRepository.addStudents(group);
    }
    
    public static void removeStudents(Student student){
        StudentsRepository.removeStudent(student);
    }
    
    public static int getStudentNumber(){
        return StudentsRepository.getNumberOfStudents();
    }
}

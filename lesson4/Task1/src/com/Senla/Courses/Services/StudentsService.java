package com.Senla.Courses.Services;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Comparators.Students.NameComparator;
import com.Senla.Courses.Entities.Student;
import com.Senla.Courses.Repositories.StudentsRepository;
import com.danco.training.TextFileWorker;
import java.util.Arrays;
import java.util.Comparator;

public class StudentsService {

    private static int ID = 1;
    private static final TextFileWorker studentTextWorker = new TextFileWorker("Students.txt");
    private final StudentsRepository studentsRepository = new StudentsRepository();

    public static Student  getStudent(Student[] students, int ID) {
        Student neededStudent = getStudentByID(students, ID);
        return neededStudent;
    }

    private static Student  getStudentByID(Student[] students, int ID) {
        Student neededStudent = new Student(null);
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i].getID() == ID) {
                neededStudent = students[i];
            }
        }
        return neededStudent;
    }

    public  String[] giveStudentsList() {
        String[] studentsList = new String[studentsRepository.getStudents().length];
        for (int i = 0; i < studentsRepository.getStudents().length; i++) {
            if (studentsRepository.getStudents()[i] != null) {
                studentsList[i] = studentsRepository.getStudents()[i].getName()+" \n "+studentsRepository.getStudents()[i].getID();
            } else {
                break;
            }
        }
        studentTextWorker.writeToFile(studentsList);
        return studentsList;
    }
    
    public Student[] recieveStudentsList(){
        Student[] students = new Student[studentTextWorker.readFromFile().length/2];
        int index = 0;
        if(studentTextWorker.readFromFile()!=null)
        {
            for(int i = 0; i<studentTextWorker.readFromFile().length-1; i+=2){
                students[index] = registerStudent(students[index], studentTextWorker.readFromFile()[i]);
                students[index].setID(Integer.valueOf(studentTextWorker.readFromFile()[i+1]));
                index++;
                }
        }
        return students;
    }


    public  Student registerStudent(Student student, String name) {
        student = new Student(name);
        student.setID(ID * 100);
        ID++;
        return student;
    }

    public  void addStudent(Student student){
        studentsRepository.addStudent(student);
    } 
    
    public  void addStudents(Student[] group){
        studentsRepository.addStudents(group);
    }
    
    public  void removeStudent(Student student){
        studentsRepository.removeStudent(student);
    }
    
    public  int getNumberOfStudents(){
        return studentsRepository.getNumberOfStudents();
    }
    
    public Student[] getStudents(){
        return studentsRepository.getStudents();
    }
    
     
     public void sort(){
         Arrays.sort(studentsRepository.getStudents(), 0, getNumberOfStudents(), new NameComparator());
         
     }
     
}

package com.senla.course.services;

import com.senla.course.comparators.students.NameComparator;
import com.senla.course.entities.Student;
import com.senla.course.repositories.StudentsRepository;
import com.danco.training.TextFileWorker;
import com.senla.course.utils.Printer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentsService {

    private static int ID = 1;
    private static final TextFileWorker studentTextWorker = new TextFileWorker("Students.txt");

    public Student getStudent(List<Student> students, int ID) {
        return getStudentByID(students, ID);
    }

    private Student getStudentByID(List<Student> students, int ID) {
        Student neededStudent = new Student(null);
        try{
            for (int i = 0; i < students.size() - 1; i++) {
            if (students.get(i).getID() == ID) {
                neededStudent = students.get(i);
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Student wasn't found.");
        }
        return neededStudent;
    }

    public String[] giveStudentsList() {
        String[] studentsList = new String[StudentsRepository.getRepository().getStudents().size()];
        try{
            for (int i = 0; i < StudentsRepository.getRepository().getStudents().size(); i++) {
            if (StudentsRepository.getRepository().getStudents().isEmpty() == false) {
                studentsList[i] = StudentsRepository.getRepository().getStudents().get(i).toString();
            } else {
                break;
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Wrong students list. Students weren't added to text file.");
        }
        studentTextWorker.writeToFile(studentsList);
        return studentsList;
    }

    public List recieveStudentsList() {
        Student[] students = new Student[studentTextWorker.readFromFile().length / 2];
        int index = 0;
        if (studentTextWorker.readFromFile() != null) {
            for (int i = 0; i < studentTextWorker.readFromFile().length - 1; i += 2) {
                students[index] = registerStudent(students[index], studentTextWorker.readFromFile()[i]);
                students[index].setID(Integer.valueOf(studentTextWorker.readFromFile()[i + 1]));
                index++;
            }
        }
        List<Student> preparedStudents = Arrays.asList(students);
        return preparedStudents;
    }

    public Student registerStudent(Student student, String name) {
        student = new Student(name);
        student.setID(ID * 100);
        ID++;
        return student;
    }

    public void addStudent(Student student) {
        StudentsRepository.getRepository().addStudent(student);
    }

    public void addStudents(List<Student> group) {
        StudentsRepository.getRepository().addStudents(group);
    }

    public void removeStudent(Student student) {
        StudentsRepository.getRepository().removeStudent(student);
    }

    public int getNumberOfStudents() {
        return StudentsRepository.getRepository().getNumberOfStudents();
    }

    public List<Student> getStudents() {
        return StudentsRepository.getRepository().getStudents();
    }

    public void sort() {
        Collections.sort(StudentsRepository.getRepository().getStudents(), new NameComparator());

    }

}

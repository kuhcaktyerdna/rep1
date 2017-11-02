package com.Senla.Courses.Entities;

public class Course extends Entity {

    private final Lection[] lections;
    private final Student[] students;

    public Course(String name, Lection[] lections, Student[] students) {
        super(name);
        this.lections = lections;
        this.students = students;
    }

    public Lection[] getLections() {
        return lections;
    }

    public Student[] getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return students.length;
    }

}

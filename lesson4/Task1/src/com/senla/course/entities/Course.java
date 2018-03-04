package com.senla.course.entities;

import java.util.List;

public class Course extends Entity {

    private final List<Lection> lections;
    private final List<Student> students;

    public Course(String name, List<Lection> lections, List<Student> students) {
        super(name);
        this.lections = lections;
        this.students = students;
    }

    public List<Lection> getLections() {
        return lections;
    }

    public List<Student> getStudents() {
        return students;
    }
    
    public int getNumberOfStudents() {
        return students.size();
    }

}

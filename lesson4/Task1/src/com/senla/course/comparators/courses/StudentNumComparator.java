
package com.senla.course.comparators.courses;

import com.senla.course.entities.Course;
import java.util.Comparator;


public class StudentNumComparator implements Comparator<Course> {

    @Override
    public int compare(Course o1, Course o2) {
        /*if(o1.getNumberOfStudents()> o2.getNumberOfStudents())
            return -1;
        else if(o1.getNumberOfStudents()==o2.getNumberOfStudents())
            return 0;
        return 1;*/ return o1.getNumberOfStudents() - o2.getNumberOfStudents();
    }



}

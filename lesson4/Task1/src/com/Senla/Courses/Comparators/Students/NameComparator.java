
package com.Senla.Courses.Comparators.Students;

import com.Senla.Courses.Entities.Student;
import java.util.Comparator;


public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1!=null&&o2!=null)
            return o1.getName().compareTo(o2.getName());
        else if(o1!=null&&o2==null)
            return 1;
        else
            return -1;

}}

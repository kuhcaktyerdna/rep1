package com.Senla.Courses.Comparators.Lectors;

import com.Senla.Courses.Entities.Lector;
import java.util.Comparator;

public class NameComparator implements Comparator<Lector> {

    @Override
    public int compare(Lector o1, Lector o2) {
        if(o1!=null&&o2!=null)
            return o1.getName().compareTo(o2.getName());
        else if(o1!=null&&o2==null)
            return 1;
        else
            return -1;

}}



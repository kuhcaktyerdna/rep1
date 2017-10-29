package com.Senla.Courses.Comparators;

import com.Senla.Courses.Entities.Lection;
import java.util.Comparator;

public class LectionDateComparator implements Comparator<Lection> {

    @Override
    public int compare(Lection o1, Lection o2) {
       return o1.getDate().compareTo(o2.getDate());
    }

}

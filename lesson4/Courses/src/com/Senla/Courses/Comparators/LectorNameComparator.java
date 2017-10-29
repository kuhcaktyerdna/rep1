package com.Senla.Courses.Comparators;

import com.Senla.Courses.Entities.Lector;
import java.util.Comparator;

public class LectorNameComparator implements Comparator<Lector> {

    @Override
    public int compare(Lector o1, Lector o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

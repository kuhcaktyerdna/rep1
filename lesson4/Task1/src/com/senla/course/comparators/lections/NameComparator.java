package com.senla.course.comparators.lections;

import com.senla.course.entities.Lection;
import java.util.Comparator;

public class NameComparator implements Comparator<Lection> {

    @Override
    public int compare(Lection o1, Lection o2) {
        if (o1 != null && o2 != null) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }

    }
}

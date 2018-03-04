package com.senla.course.repositories;

import com.senla.course.utils.Printer;
import com.senla.course.entities.Lection;
import java.util.ArrayList;
import java.util.List;

public class LectionsRepository {

    private static final LectionsRepository LECTIONS_REPOSITORY = new LectionsRepository();
    private static final List<Lection> LECTIONS = new ArrayList();

    private LectionsRepository() {
    }

    public void addLection(Lection lection) {
        try {
            LECTIONS.add(lection);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lection wasn't added.");
        }
    }

    public void addLections(List<Lection> lectionsGroup) {
        try {
            LECTIONS.addAll(lectionsGroup);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lections weren't added.");
        }
    }

    public void removeLection(Lection lection) {
        try {
            LECTIONS.remove(lection);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lection wasn't removed.");
        }
    }

    public List<Lection> getLections() {
        return LECTIONS;
    }

    public static int getNumberOfLections() {
        return LECTIONS.size();
    }

    public static LectionsRepository getRepository() {
        return LECTIONS_REPOSITORY;
    }

}

package com.senla.course.repositories;

import com.senla.course.utils.Printer;
import com.senla.course.entities.Lector;
import java.util.ArrayList;
import java.util.List;

public class LectorsRepository {

    private static final LectorsRepository LECTORS_REPOSITORY = new LectorsRepository();
    private static final List<Lector> LECTORS = new ArrayList();

    private LectorsRepository() {
    }

    public void addLector(Lector lector) {
        try {
            LECTORS.add(lector);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lector wasn't added.");
        }
    }

    public void addLectors(List<Lector> lectorsGroup) {
        try {
            LECTORS.addAll(lectorsGroup);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lectors weren't added.");
        }
    }

    public void removeLector(Lector lector) {
        try {
            LECTORS.remove(lector);
        } catch (ArrayIndexOutOfBoundsException e) {
            Printer.print("Error. Lector wasn't removed.");
        }
    }

    public List<Lector> getLectors() {
        return LECTORS;
    }

    public int getNumberOfLectors() {
        return LECTORS.size();
    }

    public static LectorsRepository getRepository() {
        return LECTORS_REPOSITORY;
    }
}

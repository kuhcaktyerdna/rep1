package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Lector;
import com.Senla.Courses.Services.LectorsService;

public class LectorsRepository {

    private static Lector[] lectors = new Lector[1];
    private static int numberOfLectors = 0;

    public static void addLector(Lector lector) {
        if (ArrayWorker.arrayIsFull(lectors) == false) {
            lectors[numberOfLectors] = lector;
            numberOfLectors++;
        } else {
            lectors = (Lector[])ArrayWorker.expandArray(lectors);
        }
        lectors = LectorsService.sort(lectors);
    }

    public static void addLectors(Lector[] lectorsGroup) {
        for (int i = 0; i < lectorsGroup.length; i++) {
            if (ArrayWorker.arrayIsFull(lectors) == false) {
                lectors[numberOfLectors] = lectorsGroup[i];
                numberOfLectors++;
            } else {
                lectors = ArrayWorker.expandArray(lectors);
                i--;
                
            }
        }
    }

    public static void removeLector(Lector lector) {
        for (int i = 0; i < lectors.length; i++) {
            if (lector.getID() == lectors[i].getID()) {
                lectors[i] = null;
            }
            lectors = (Lector[]) ArrayWorker.removeEmptySpace(lectors);
        }
    }

    public static int getNumberOfLectors() {
        return numberOfLectors;
    }

    public static Lector[] getLectors() {
        return lectors;
    }
}

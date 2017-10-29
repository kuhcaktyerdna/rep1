package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Lection;
import com.Senla.Courses.Services.LectionsService;

public class LectionsRepository {

    private static Lection[] lections = new Lection[5];
    private static int numberOfLections;

    public static void addLection(Lection lection) {
        if (ArrayWorker.arrayIsFull(lections) == false) {
            lections[numberOfLections] = lection;
            numberOfLections++;
        } else {
            lections = (Lection[])ArrayWorker.expandArray(lections);
            
        }
        lections = LectionsService.sort(lections);
    }

    public static void addLections(Lection[] lectionsGroup) {
        for (int i = 0; i < lectionsGroup.length; i++) {
            if (ArrayWorker.arrayIsFull(lections) == false) {
                lections[numberOfLections] = lectionsGroup[i];
                numberOfLections++;
            } else {
                lections =  ArrayWorker.expandArray(lections);
                i--;
                break;
            }
        }
    }

    public static void removeLection(Lection lection) {
        for (int i = 0; i < lections.length; i++) {
            if (lection.getID() == lections[i].getID()) {
                lections[i] = null;
            }
            lections = (Lection[]) ArrayWorker.removeEmptySpace(lections);
        }
    }

    public static int getNumberOfLections() {
        return numberOfLections;
    }

    public static Lection[] getLections() {
        return lections;
    }

}

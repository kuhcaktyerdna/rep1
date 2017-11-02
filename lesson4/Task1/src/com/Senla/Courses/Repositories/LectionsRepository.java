package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Entity;
import com.Senla.Courses.Entities.Lection;
import java.util.Arrays;

public class LectionsRepository {

    private static Lection[] lections = new Lection[10];
    private static int numberOfLections = 0;
    
    public static void addLection(Lection lection) {
        if (ArrayWorker.arrayIsFull(lections) == false) {
            lections[numberOfLections] = lection;
        } else {
            lections = castEntitiesArray((Lection[]) ArrayWorker.expandArray(lections));
            lections[numberOfLections] = lection;
        }
        numberOfLections++;

    }

    public static void addLections(Lection[] lectionsGroup) {
        for (int i = 0; i < lectionsGroup.length; i++) {
            if (ArrayWorker.arrayIsFull(lections) == false) {
                lections[numberOfLections] = lectionsGroup[i];
                numberOfLections++;
            } else {
                lections = castEntitiesArray(ArrayWorker.expandArray(lections));
                i--;
            }
        }
    }

    private static Lection[] castEntitiesArray(Entity[] entities){
        Lection[] lections = Arrays.copyOf(entities, entities.length, Lection[].class);
        return lections;
    }
    
    public void removeLection(Lection lection) {
        lections = (Lection[]) ArrayWorker.remove(lections, lection);
        numberOfLections--;
    }
    
    public  Lection[] getLections() {
        return lections;
    }
    
    public static int getNumberOfLections(){
        return numberOfLections;
    }

}

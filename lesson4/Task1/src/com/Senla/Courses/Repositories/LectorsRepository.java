package com.Senla.Courses.Repositories;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Entity;
import com.Senla.Courses.Entities.Lector;
import java.util.Arrays;

public class LectorsRepository {

    private static Lector[] lectors = new Lector[5];
    private static int numberOfLectors = 0;
    
    public static void addLector(Lector lector) {
        if (ArrayWorker.arrayIsFull(lectors) == false) {
            lectors[numberOfLectors] = lector;
        } else {
            lectors = castEntitiesArray(ArrayWorker.expandArray(lectors));
            lectors[numberOfLectors] = lector;
        }
        numberOfLectors++;

    }

    public static void addLectors(Lector[] lectorsGroup) {
        for (int i = 0; i < lectorsGroup.length; i++) {
            if (ArrayWorker.arrayIsFull(lectors) == false) {
                lectors[numberOfLectors] = lectorsGroup[i];
                numberOfLectors++;
            } else {
                lectors = castEntitiesArray(ArrayWorker.expandArray(lectors));
                i--;
            }
        }
    }
    
    private static Lector[] castEntitiesArray(Entity[] entities){
        Lector[] lectors = Arrays.copyOf(entities, entities.length, Lector[].class);
        return lectors;
    }

    public void removeLector(Lector lector) {
        lectors = (Lector[]) ArrayWorker.remove(lectors, lector);
        numberOfLectors--;
    }

    public  Lector[] getLectors() {
        return lectors;
    }
    
    public static int getNumberOfLectors(){
        return numberOfLectors;
    }
}

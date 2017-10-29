package com.Senla.Courses.Services;

import com.Senla.Courses.Entities.Lector;
import com.Senla.Courses.Comparators.LectorNameComparator;
import com.Senla.Courses.Repositories.LectorsRepository;
import com.danco.training.TextFileWorker;

public class LectorsService {

    static LectorNameComparator nameComparator = new LectorNameComparator();
    static TextFileWorker lectorsTextWorker = new TextFileWorker("Lectors.txt");

    public Lector getLector(Lector[] lectors, int ID) {
        Lector neededLector = null;
        for (int i = 0; i < lectors.length - 1; i++) {
            if (lectors[i].getID() == ID) {
                neededLector = lectors[i];
            }
        }
        return neededLector;
    }

    public static Lector[] sort(Lector[] lectors) {
        return lectors;
    }

    private static Lector[] sortByName(Lector[] lectors) {
        for (int i = 0; i < lectors.length - 1; i++) {
            for (int j = i + 1; j < lectors.length; j++) {
                if (nameComparator.compare(lectors[i], lectors[j]) == 1) {
                    Lector temp = lectors[i];
                    lectors[i] = lectors[j];
                    lectors[j] = temp;
                }
            }
        }
        return lectors;
    }

    public static String[] giveLectorsList() {
        String[] lectorsList = new String[LectorsRepository.getLectors().length];
        for (int i = 0; i < LectorsRepository.getLectors().length; i++) {
            if (LectorsRepository.getLectors()[i] != null) {
                lectorsList[i] = LectorsRepository.getLectors()[i].getName()+"; ID: "+LectorsRepository.getLectors()[i].getID();
            } else {
                break;
            }
        }
        lectorsTextWorker.writeToFile(lectorsList);
        return lectorsList;
    }
    
    public static void addLector(Lector lector){
        LectorsRepository.addLector(lector);
    }
    
    public static void addLectors(Lector[] lectors){
        LectorsRepository.addLectors(lectors);
    }
    
     public static void removeLector(Lector lector){
         LectorsRepository.removeLector(lector);
     }
     
     public static int getNumberOfLectors(){
         int numberOfLectors = LectorsRepository.getNumberOfLectors();
         return numberOfLectors;
     }

}

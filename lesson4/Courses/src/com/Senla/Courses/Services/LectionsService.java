package com.Senla.Courses.Services;

import com.Senla.Courses.Entities.Lection;
import com.Senla.Courses.Comparators.LectionDateComparator;
import com.Senla.Courses.Repositories.LectionsRepository;
import com.danco.training.TextFileWorker;

public class LectionsService {

    static TextFileWorker lectionsTextWorker = new TextFileWorker("Lections.txt");
    
    public static Lection getLection(Lection[] lections, int ID) {
        Lection neededLection = getLectionByID(lections, ID);
        return neededLection;
    }

    private static Lection getLectionByID(Lection[] lections, int ID) {
        Lection neededLection = null;
        for (int i = 0; i < lections.length - 1; i++) {
            if (lections[i].getID() == ID) {
                neededLection = lections[i];
            }
        }
        return neededLection;
    }

    static LectionDateComparator dateCompare = new LectionDateComparator();

    public static Lection[] sort(Lection[] lections) {
        lections = sortByDate(lections);
        return lections;
    }

    private static Lection[] sortByDate(Lection[] lections) {
        if(LectionsRepository.getNumberOfLections()>1){
        for (int i = 0; i < lections.length - 1; i++) {
            for (int j = i + 1; j < lections.length-1; j++) {
                if (dateCompare.compare(lections[i], lections[j]) == 1) {
                    Lection temp = lections[i];
                    lections[i] = lections[j];
                    lections[j] = temp;
                }}
            }
        }
        return lections;
    }
    
    public static String[] giveLectionsList() {
        String[] studentsList = new String[LectionsRepository.getLections().length];
        for (int i = 0; i < LectionsRepository.getLections().length; i++) {
            if (LectionsRepository.getLections()[i] != null) {
                studentsList[i] = LectionsRepository.getLections()[i].getName()  +"; ID: "+LectionsRepository.getLections()[i].getID();
            } else {
                break;
            }
        }
        lectionsTextWorker.writeToFile(studentsList);
        return studentsList;
    }
    
    public static void addLections(Lection[] lectionsGroup){
        LectionsRepository.addLections(lectionsGroup);
        }
    
    public static void addLection(Lection lection){
        LectionsRepository.addLection(lection);
    }
    
    public static void removeLection(Lection lection){
        LectionsRepository.removeLection(lection);
    }
    
    public static int getNumberOfLections(){
        int numberOfLections = LectionsRepository.getNumberOfLections();
        return numberOfLections;
    }
}


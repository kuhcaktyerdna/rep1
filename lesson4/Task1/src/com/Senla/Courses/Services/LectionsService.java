package com.Senla.Courses.Services;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Comparators.Lections.NameComparator;
import com.Senla.Courses.Entities.Lection;
import com.Senla.Courses.Repositories.LectionsRepository;
import com.danco.training.TextFileWorker;
import java.util.Arrays;

public class LectionsService {

    TextFileWorker lectionsTextWorker = new TextFileWorker("Lections.txt");
    LectionsRepository lectionsRepository = new LectionsRepository();
    private int lectionID=111;
    

    
    public Lection createLection(Lection lection, String name){
        lection = new Lection(name);
        lection.setID(lectionID);
        lectionID += 111;
        return lection;
    }
    
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

    public String[] giveLectionsList() {
        String[] lectionsList = new String[lectionsRepository.getLections().length];
        for (int i = 0; i < lectionsRepository.getLections().length; i++) {
            if (lectionsRepository.getLections()[i] != null) {
                lectionsList[i] = lectionsRepository.getLections()[i].getName() + " \n " + lectionsRepository.getLections()[i].getID();
            } else {
                break;
            }
        }
        lectionsTextWorker.writeToFile(lectionsList);
        return lectionsList;
    }
    
        public Lection[] recieveLectionsList(){
        Lection[] lections = new Lection[lectionsTextWorker.readFromFile().length/2];
        int index = 0;
        if(lectionsTextWorker.readFromFile()!=null)
        {
            for(int i = 0; i<lectionsTextWorker.readFromFile().length-1; i+=2){
                lections[index] = createLection(lections[index], lectionsTextWorker.readFromFile()[i]);
                lections[index].setID(Integer.valueOf(lectionsTextWorker.readFromFile()[i+1]));
                index++;
                }
        }
        return lections;
    }

    public void addLections(Lection[] lectionsGroup) {
        lectionsRepository.addLections(lectionsGroup);
    }

    public void addLection(Lection lection) {
        lectionsRepository.addLection(lection);
    }

    public void removeLection(Lection lection) {
        lectionsRepository.removeLection(lection);
    }

    public int getNumberOfLections() {
        return lectionsRepository.getNumberOfLections();
    }
    
    public Lection[] getLections(){
        return lectionsRepository.getLections();
    }
    
    public void sort(){
        Arrays.sort(getLections(), 0, getNumberOfLections(), new NameComparator());
    }
}

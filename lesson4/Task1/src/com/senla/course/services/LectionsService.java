package com.senla.course.services;

import com.senla.course.comparators.lections.NameComparator;
import com.senla.course.entities.Lection;
import com.senla.course.repositories.LectionsRepository;
import com.danco.training.TextFileWorker;
import com.senla.course.utils.Printer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LectionsService {

    TextFileWorker lectionsTextWorker = new TextFileWorker("Lections.txt");
    private int lectionID=111;
    

    
    public Lection createLection(Lection lection, String name){
        lection = new Lection(name);
        lection.setID(lectionID);
        lectionID += 111;
        return lection;
    }
    
    public  Lection getLection(List<Lection> lections, int ID) {
        return getLectionByID(lections, ID);
    }

    private  Lection getLectionByID(List<Lection> lections, int ID) {
        Lection neededLection = null;
        try{
            for (int i = 0; i < lections.size() - 1; i++) {
            if (lections.get(i).getID() == ID) {
                neededLection = lections.get(i);
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Lection not found.");
        }
        return neededLection;
    }

    public String[] giveLectionsList() {
        String[] lectionsList = new String[LectionsRepository.getRepository().getLections().size()];
        try{
            for (int i = 0; i < LectionsRepository.getRepository().getLections().size()-1; i++) {
            if (LectionsRepository.getRepository().getLections().isEmpty()==false){
                lectionsList[i] = LectionsRepository.getRepository().getLections().get(i).toString();
            } else {
                break;
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Wrong lectionslist. Lections weren't added to text file.");
        }
        lectionsTextWorker.writeToFile(lectionsList);
        return lectionsList;
    }
    
        public List recieveLectionsList(){
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
        List<Lection> preparedLections = Arrays.asList(lections);
        return preparedLections;
    }

    public void addLections(List<Lection> lectionsGroup) {
        LectionsRepository.getRepository().addLections(lectionsGroup);
    }

    public void addLection(Lection lection) {
        LectionsRepository.getRepository().addLection(lection);
    }

    public void removeLection(Lection lection) {
        LectionsRepository.getRepository().removeLection(lection);
    }

    public int getNumberOfLections() {
        return LectionsRepository.getRepository().getNumberOfLections();
    }
    
    public List<Lection> getLections(){
        return LectionsRepository.getRepository().getLections();
    }
    
    public void sort(){
        Collections.sort(getLections(), new NameComparator());
    }
}

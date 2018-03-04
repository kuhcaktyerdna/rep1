package com.senla.course.services;

import com.senla.course.entities.Lector;
import com.senla.course.entities.Lection;
import com.senla.course.comparators.lectors.NameComparator;
import com.senla.course.repositories.LectorsRepository;
import com.danco.training.TextFileWorker;
import com.senla.course.utils.Printer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LectorsService {

    NameComparator nameComparator = new NameComparator();
    TextFileWorker lectorsTextWorker = new TextFileWorker("Lectors.txt");
    private static int ID = 1;

    
    public Lector getLector(List<Lector> lectors, int ID){
        return getLectorByID(lectors, ID);
    }
    
    private Lector getLectorByID(List<Lector> lectors, int ID) {
        Lector neededLector = null;
        try{
            for (int i = 0; i < lectors.size() - 1; i++) {
            if (lectors.get(i).getID() == ID) {
                neededLector = lectors.get(i);
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Lector wasn't found. ");
        }
        return neededLector;
    }

    public Lector registerLector(Lector lector, String name, Lection lection){
        lector = new Lector(name, lection);
        lector.setID(ID);
        ID++;
        return lector;
    }

    public String[] giveLectorsList() {
        String[] lectorsList = new String[LectorsRepository.getRepository().getLectors().size()];
        try{
            for (int i = 0; i < LectorsRepository.getRepository().getLectors().size(); i++) {
             if (LectorsRepository.getRepository().getLectors().isEmpty()==false){
                lectorsList[i] = LectorsRepository.getRepository().getLectors().get(i).toString();
            } else {
                break;
            }
        }}catch(NullPointerException e){
            Printer.print("Error. Wrong lectors list. Lectors weren't added to text file. ");
        }
        lectorsTextWorker.writeToFile(lectorsList);
        return lectorsList;
    }
    
    public List recieveLectorsList(){
        Lector[] lectors = new Lector[lectorsTextWorker.readFromFile().length/2];
        int index = 0;
        if(lectorsTextWorker.readFromFile()!=null)
        {
            for(int i = 0; i<lectorsTextWorker.readFromFile().length-1; i+=2){
                lectors[index] = registerLector(lectors[index], lectorsTextWorker.readFromFile()[i], null);
                lectors[index].setID(Integer.valueOf(lectorsTextWorker.readFromFile()[i+1]));
                index++;
                }
        }
        List<Lector> preparedLector = Arrays.asList(lectors);
        return preparedLector;
    }

    
    public  void addLector(Lector lector){
        LectorsRepository.getRepository().addLector(lector);
    }
    
    public  void addLectors(List<Lector> lectors){
        LectorsRepository.getRepository().addLectors(lectors);
    }
    
     public  void removeLector(Lector lector){
         LectorsRepository.getRepository().removeLector(lector);
     }
     
     public int getNumberOfLectors(){
        return LectorsRepository.getRepository().getNumberOfLectors();
     }
     
     public List<Lector> getLectors(){
         return LectorsRepository.getRepository().getLectors();
     }
     
     public void sort(){
         Collections.sort(getLectors(), new NameComparator());
     }

}

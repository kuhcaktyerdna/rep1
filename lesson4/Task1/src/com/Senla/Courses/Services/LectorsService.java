package com.Senla.Courses.Services;

import com.Senla.Courses.ArrayWorker;
import com.Senla.Courses.Entities.Lector;
import com.Senla.Courses.Entities.Lection;
import com.Senla.Courses.Comparators.Lectors.NameComparator;
import com.Senla.Courses.Repositories.LectorsRepository;
import com.danco.training.TextFileWorker;
import java.util.Arrays;
import java.util.Comparator;

public class LectorsService {

    NameComparator nameComparator = new NameComparator();
    TextFileWorker lectorsTextWorker = new TextFileWorker("Lectors.txt");
    private static int ID = 1;
    private LectorsRepository lectorsRepository = new LectorsRepository();

    
    public static Lector getLector(Lector[] lectors, int ID) {
        Lector neededLector = null;
        for (int i = 0; i < lectors.length - 1; i++) {
            if (lectors[i].getID() == ID) {
                neededLector = lectors[i];
            }
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
        String[] lectorsList = new String[lectorsRepository.getLectors().length];
        for (int i = 0; i < lectorsRepository.getLectors().length; i++) {
            if (lectorsRepository.getLectors()[i] != null) {
                lectorsList[i] = lectorsRepository.getLectors()[i].getName()+" \n "+lectorsRepository.getLectors()[i].getID();
            } else {
                break;
            }
        }
        lectorsTextWorker.writeToFile(lectorsList);
        return lectorsList;
    }
    
    public Lector[] recieveLectorsList(){
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
        return lectors;
    }

    
    public  void addLector(Lector lector){
        lectorsRepository.addLector(lector);
    }
    
    public  void addLectors(Lector[] lectors){
        lectorsRepository.addLectors(lectors);
    }
    
     public  void removeLector(Lector lector){
         lectorsRepository.removeLector(lector);
     }
     
     public int getNumberOfLectors(){
        return lectorsRepository.getNumberOfLectors();
     }
     
     public Lector[] getLectors(){
         return lectorsRepository.getLectors();
     }
     
     
     public void sort(){
         Arrays.sort(getLectors(), 0, getNumberOfLectors(), new NameComparator());
     }

}

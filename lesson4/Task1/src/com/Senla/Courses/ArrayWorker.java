package com.Senla.Courses;

import com.Senla.Courses.Entities.*;
import com.Senla.Courses.Repositories.StudentsRepository;

public class ArrayWorker {
private static int destNum;
    public static Entity[] expandArray(Entity[] array) {
        Entity[] expandedArray = new Entity[array.length * 2];
        System.arraycopy(array, 0, expandedArray, 0, array.length);
        return expandedArray;
    }
    
    public static Course[] expandArray(Course[] array) {
        Course[] expandedArray = new Course[array.length * 2];
        System.arraycopy(array, 0, expandedArray, destNum, array.length);
        destNum += array.length;
        return expandedArray;
    }
    



    public static boolean arrayIsFull(Entity[] array) {
        return array[array.length - 2] != null;
    }

    
     public static Entity[] remove(Entity[] entity, Entity element)
    {   
        for(int i=0;i<StudentsRepository.getNumberOfStudents()-1;i++){
            if(entity[i].getID()==element.getID()){
                for(int j=i;j<entity.length-1;j++)
                entity[j]=entity[j+1];
            }
        }
        return entity;
    }

}

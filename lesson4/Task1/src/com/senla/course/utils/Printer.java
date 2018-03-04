
package com.senla.course.utils;

import com.senla.course.entities.Entity;


public class Printer {
    
    public static void print(String text){
        System.out.println(text);
    }
    
    public static void print(int text){
        System.out.println(text);
    }
    
    public static void printArray(Entity[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=null){
            print(array[i].toString());
            } else
                break;
        }
    }

}

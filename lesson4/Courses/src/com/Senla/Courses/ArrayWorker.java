package com.Senla.Courses;

import com.Senla.Courses.Entities.*;

public class ArrayWorker {
private static int destNum;
    public static Student[] expandArray(Student[] array) {
        Student[] expandedArray = new Student[array.length * 2];
        System.arraycopy(array, 0, expandedArray, destNum, array.length);
        destNum += array.length;
        return expandedArray;
    }
    
    public static Course[] expandArray(Course[] array) {
        Course[] expandedArray = new Course[array.length * 2];
        System.arraycopy(array, 0, expandedArray, destNum, array.length);
        destNum += array.length;
        return expandedArray;
    }
    
    public static Lector[] expandArray(Lector[] array) {
        Lector[] expandedArray = new Lector[array.length * 2];
        System.arraycopy(array, 0, expandedArray, destNum, array.length);
        destNum += array.length;
        return expandedArray;
    }
    
    public static Lection[] expandArray(Lection[] array) {
        Lection[] expandedArray = new Lection[array.length * 2];
        System.arraycopy(array, 0, expandedArray, destNum, array.length);
        destNum += array.length;
        return expandedArray;
    }

    public static boolean arrayIsFull(Entity[] array) {
        if (array[array.length - 1] != null) {
            return true;
        }
        return false;
    }

    public static Entity[] removeEmptySpace(Entity[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null && array[i + 1] != null) {
                array[i] = array[i + 1];
            }
        }
        return array;
    }

}

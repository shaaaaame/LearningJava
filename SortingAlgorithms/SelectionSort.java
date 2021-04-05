package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array){

        int[] checkArray = array;
        int pointer = 0;

        while (pointer != array.length){

            //put min value in front
            array[pointer] = getMin(checkArray)[0];

            //shorten the check array
            int[] temp = checkArray;
            checkArray = new int[]{};
            for (int j = 0; j < temp.length; j++){
                if (!(j == getMin(temp)[1])){
                    checkArray = append(checkArray, temp[j]);
                }
            }


            pointer++;
        }

        return array;

    }

    public static int[] getMin(int[] array){

        int minVal = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){

            if (array[i] < minVal){
                minVal = array[i];
                index = i;
            }
        }


        return new int[]{minVal, index};
    }

    public static int[] append(int[] array, int value){

        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;

        return array;

    }

}

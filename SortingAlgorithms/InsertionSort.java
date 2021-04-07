package com.company;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){

        int[] sortedArray = Arrays.copyOf(array, array.length);

        sortedArray[0] = array[0];

        //for each element in the array...
        for (int pointer = 1; pointer < array.length; pointer++){
            //for each element in sorted array...
            for (int j = pointer - 1; j > -1 ; j--){
                //element to insert = array[pointer]
                //element to compare with = sortedArray[j]
                //if the element to insert is less than the compared element...
                if (array[pointer] < sortedArray[j]){
                    //move compared element to the right
                    sortedArray = swapElement(sortedArray, j, j + 1);
                }
            }
        }
        return sortedArray;

    }

    //swaps two elements in an array given their indexes
    public static int[] swapElement(int[] array, int index1, int index2){

        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;

    }

}

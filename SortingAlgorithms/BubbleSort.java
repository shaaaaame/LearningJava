package com.company;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){

        boolean finished = false;

        while (!finished){
            int swaps = 0;
            for (int i = 0; i < array.length - 1; i++){

                if (array[i] > array[i + 1]){

                    int temp;

                    //swaps array[i] and array[i + 1]
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    ++swaps;

                }

            }
            // if there are no more swaps, array is sorted
            if (swaps == 0){
                finished = true;
            }
        }

        return array;

    }

}
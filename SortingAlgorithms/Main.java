package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String[] sortList = new String[]{
            "Selection Sort",
            "Bubble Sort",
            "Insertion Sort",
            "Merge Sort",
            "Quick Sort",
            "Radix Sort"
    };

    public static void main(String[] args) {

        boolean done = false;
        int[] testArray = new int[]{};
        int index = 0;

        while (!done){

            //take in input for integer to append to array
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter an integer to add to array : ");

            //append to array by copying array, then making a new array
            //with + 1 length and adding the element to end of array
            testArray = Arrays.copyOf(testArray, testArray.length + 1);
            testArray[testArray.length - 1] = scn.nextInt();

            //checks if user no longer wants to enter new elements into
            //array
            scn = new Scanner(System.in);
            System.out.println("Enter another number? (Y/N)");
            if (scn.nextLine().equals("N")){
                done = true;
            }

        }

        //runs the sort that is chosen by the user on the array testArray
        testArray = runSort(chooseSort(), testArray);

        //prints the elements in order
        System.out.println();
        for (int i = 0; i <= testArray.length - 1; i++){
            System.out.println(testArray[i]);
        }
    }

    //returns index of sort in sortList
    public static int chooseSort(){

        Scanner scn = new Scanner(System.in);
        System.out.println("What type of sort would you like to try? (Enter integer)");
        for (int i = 0; i < sortList.length; i++){
            System.out.println(sortList[i] + " : " + Integer.toString(i));
        }

        return (scn.nextInt() );

    }

    public static int[] runSort(int sortIndex, int[] array){

        switch(sortIndex){
            case 0:
                array = SelectionSort.selectionSort(array);
                break;
            case 1:
                array = BubbleSort.bubbleSort(array);
                break;
            case 2:
                array = InsertionSort.insertionSort(array);
                break;
        }

        return array;
    }

}
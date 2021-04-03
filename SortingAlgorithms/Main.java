package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        boolean done = false;
        int[] test = new int[]{};
        int index = 0;

        while (!done){

            //take in input for integer to append to array
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter an integer to add to array : ");

            //append to array by copying array, then making a new array
            //with + 1 length and adding the element to end of array
            test = Arrays.copyOf(test, test.length + 1);
            test[test.length - 1] = scn.nextInt();

            //checks if user no longer wants to enter new elements into
            //array
            scn = new Scanner(System.in);
            System.out.println("Enter another number? (Y/N)");
            if (scn.nextLine().equals("N")){
                done = true;
            }

        }

        //run bubble sort!
        test = Sort.bubbleSort(test);

        //prints the elements in order
        for (int i = 0; i <= test.length - 1; i++){
            System.out.println(test[i]);
        }
    }
}

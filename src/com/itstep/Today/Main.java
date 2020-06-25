package com.itstep.Today;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int[]myArray;
         myArray=BubbleSort.getArray();


        System.out.println("Initial value are:"+ Arrays.toString(myArray));

        long startTime=System.currentTimeMillis();
        BubbleSort.BubbleSort(myArray);
        System.out.println("After Sorting- "+ Arrays.toString(BubbleSort.BubbleSort(myArray)));
        long endTime=System.currentTimeMillis();
        long diff=endTime-startTime;
        System.out.println("BubbleSort took: " +diff+ " milliseconds");


        long startTime1=System.currentTimeMillis();

        Selection.selectionSort(myArray);
        System.out.println("After Sorting- "+Arrays.toString(myArray));

        long endTime1=System.currentTimeMillis();
        long diff1=endTime1-startTime1;
//
        System.out.println("SelectionSort took: " +diff1+ " milliseconds");
        System.out.println("Difference of time "+ (diff-diff1));


    }
}

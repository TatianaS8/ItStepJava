package com.itstep.Lesson17.Classroom;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[]myArray=new int[]{21, 2, 85, -5,36};
        System.out.println("Initial value are:"+ Arrays.toString(myArray));
        bubbleSorting(myArray);
    }
    private static void bubbleSorting(int[]arrayToSort){
        int length= arrayToSort.length;
        for (int i=0;i<length; i++){
            boolean swapped=false;
            for (int index=0; index<length-i-1; index++) {
                if (arrayToSort[index] > arrayToSort[index + 1]) {
                    int tempInt = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = tempInt;
                    swapped=true;
                }
            }
            System.out.println("Iteration nr- "+ (i + 1)+"\n" +Arrays.toString(arrayToSort));
            if (!swapped) {
                break;
            }


            }

        }
    }


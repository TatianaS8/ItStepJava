package com.itstep.Lesson17.Homework;

import java.util.Random;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[10];

        System.out.print("Random Numbers:");
        for (int i = 0; i < number.length; i++) {
            int Random = random.nextInt(100) + 1;
            System.out.print("\t" + Random);
        }

        System.out.print("\nSorted Numbers:" + Arrays.toString(BubbleSortMethod(number)));
    }


        public static int[] BubbleSortMethod ( int[] x){
            int temp;

            for (int i = 0; i < x.length - 1; i++) {
                for (int j = 1; j < x.length - 1; j++) {
                    if (x[j - 1] < x[j]) {
                        temp = x[j - 1];
                        x[j - 1] = x[j];
                        x[j] = temp;
                    }

                }
            }
            return x;
        }
    }





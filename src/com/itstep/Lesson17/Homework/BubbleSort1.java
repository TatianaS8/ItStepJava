package com.itstep.Lesson17.Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort1 {

        public static void  getArray(){
            Scanner s = new Scanner(System.in);
            //System.out.println("Total numbers :");
            int size = s.nextInt();

            //System.out.print("Random Numbers are:");
            int array[] = new int[size];
            int number = 0;
            for (int i = 0; i < size; i++) {
                //Random random = new Random();
                number = (int) (Math.random() * 10000);
                array[i] = number;
            }
            //eturn array;
            System.out.println("Array");
        }

//    public static void printArray(){
//        for(int i : a){
//            System.out.print(i+" ");
//
//    public static int[] BubbleSort(int[] a) {
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 1; j < a.length - i; j++) {
//                if (a[j - 1] > a[j]) {
//                    int temp = a[j - 1];
//                    a[j - 1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//            return a;
//        }




    }





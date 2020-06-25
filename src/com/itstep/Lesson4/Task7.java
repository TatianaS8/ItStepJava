package com.itstep.Lesson4;
//Calculate the following numbers in a one-dimensional array filled by user:
//    • The sum of negative numbers.
//    • The sum of even numbers.
//    • The sum of odd numbers.
//    • The product of elements with indexes that can be divided by 3
//    • The product of the minimum and maximum elements.
//    • The sum of elements that are between the first and the last positive elements. (inclusive first, exclusive last)


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        System.out.print("Enter 5 array numbers");

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();

        }


        //The sum of negative numbers./

        int sumnegativ = 0;
        for (int a : array) {
            if (a < 0) {
                sumnegativ += a;
            }
        }

        System.out.println("Sum of negative numbers are: " + sumnegativ);


        //The sum of even numbers.• The sum of odd numbers.

        int sumnOfEvenNumber = 0;
        int sumOfOddNumber = 0;
        for (int a : array) {
            if (a % 2 == 0) {
                sumnOfEvenNumber += a;
            } else {
                sumOfOddNumber += a;

            }
        }

        System.out.println("Sum of even numbers are: " + sumnOfEvenNumber);
        System.out.println("Sum of odd numbers are: " + sumOfOddNumber);


        //The product of the minimum and maximum elements.
        int max = array[0];
        int min = array[0];
        int prod = 0;
        for (int a : array) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        prod = min * max;
        System.out.println("product of the minimum and maximum elements is: " + prod);

        //The product of elements with indexes that can be divided by 3

        int produs =0;
        int index=array[0];
        int dividedby3=array[0];
        for (int x : array) {

            if (x % 3==0) {
            dividedby3 = x;
            produs = produs* dividedby3;}
            System.out.println("The product of elements with indexes that can be divided by 3: "+ produs);



        // The sum of elements that are between the first and the last positive elements. (inclusive first, exclusive last)

        int positiv = array[0];
        int minfirst = array[0];
        int maxLast = array[0];
        int sum = 0;
        for (int a : array) {
            if (a > 0) {
                positiv = a;
            }
            if (positiv < minfirst) {
                minfirst = positiv;
            }
            if (positiv > maxLast) {
                maxLast = positiv;
            }
        }
        for (int i = minfirst; i < maxLast; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of elements that are between the first and the last positive elements are " + sum);

    }
}}





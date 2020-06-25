//Write a method that takes two numbers as a parameter and display all even numbers between them.

package com.itstep.Lesson6.task1;

import java.util.Scanner;

public class myclass1 {
    public static void displayollevennumbers(int number1, int number2) {

        if (number1 < number2) {
            System.out.println("even numbers between " + number1 + " and " + number2 + " are :");
            for (int i = number1; i < number2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (number1 > number2) {
            System.out.println("even numbers between " + number2 + " and " + number1 + " are:");
            for (int i = number2; i < number1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number are equal");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number then second number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        displayollevennumbers(number1, number2);
    }
}

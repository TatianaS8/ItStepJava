package com.itstep.Lesson6.Classroom.Methods;
//The user enters 2 numbers from the keyboard. Display all odd numbers in the specified range.
// If the range limits were specified incorrectly, normalize them.

import java.util.Scanner;

public class Main3 {
    public static void displayOddNumbers(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 < number2) {
            displayOddNumbers(number1, number2);
        } else if (number1 > number2) {
            displayOddNumbers(number2, number1);
        } else {
            System.out.println("Numbers are equals");
        }
    }

}

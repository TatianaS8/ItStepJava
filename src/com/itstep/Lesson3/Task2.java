//The user enters two numbers from the keyboard. Calculate the sum, difference, and product of these numbers.
// Display the result.

package com.itstep.Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        System.out.println("The sum of the numbers is ");
        System.out.println(firstNumber+secondNumber);
        System.out.println("The difference of the numbers is");
        System.out.println(secondNumber-firstNumber);
        System.out.println("The product of the number is");
        System.out.println(firstNumber*secondNumber);


    }
}

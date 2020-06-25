package com.itstep.Lesson4;

import java.util.Scanner;

//The user enters two numbers (the beginning and the end of the range). Analyze all the numbers in this range.
// The output should be according to the rules below.If the number is divisible by 3 (it is divided by 3 without
// a remainder), display the word Fizz. If the number is divisible by 5, display the word Buzz.
// If the number is divisible by 3 and 5, output Fizz Buzz. If the number is not divisible by 3 or 5,
// output the number itself.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        if (firstNumber % 3 == 0 || secondNumber % 3 == 0){ {
            System.out.println("Fizz");
        }
        if (firstNumber % 5 == 0 || secondNumber % 5 == 0)
        {
            System.out.println("Buzz");
        }
        if (firstNumber % 3 == 0 && secondNumber % 5 == 0) {
            System.out.println("Fizz Buzz");

        } } else {
            System.out.println(firstNumber+" "+secondNumber);
        } }}





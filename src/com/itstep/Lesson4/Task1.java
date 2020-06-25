package com.itstep.Lesson4;

import java.util.Scanner;

// The user enters two numbers from the keyboard. Display all odd numbers in the specified range. If the range
// limits were specified incorrectly, normalize them. For example, the user entered 20 and 11, normalize the limits
// so that 11 becomes the beginning of the range and 20 the end.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

       if (firstNumber > secondNumber) {
           System.out.println(secondNumber+" "+firstNumber);
        } else {
            System.out.println(firstNumber+ " "+ secondNumber);
        }
       if (firstNumber%2==0) {
        System.out.println("odd number: "+firstNumber);}
        if (secondNumber%2==0) {
        System.out.println("odd number: "+secondNumber);}

}
}
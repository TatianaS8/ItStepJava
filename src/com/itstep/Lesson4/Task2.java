package com.itstep.Lesson4;
//The user enters a number from the keyboard. Calculate the factorial of the number. For example, if 3 was entered,
// the factorial would be 1*2*3 = 6. The factorial formula is n! = 1*2*3...*n, where n is the number to calculate
// the factorial.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int i, fact = 1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

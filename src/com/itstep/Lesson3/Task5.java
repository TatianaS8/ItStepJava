package com.itstep.Lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of hours");
        int userInputNumber = scanner.nextInt();
        if (userInputNumber >= 0 && userInputNumber < 6) {
            System.out.println("Good Night");
        } else if (userInputNumber >= 6 && userInputNumber < 13) {
            System.out.println("Good Morning");
        } else if (userInputNumber >= 13 && userInputNumber < 17) {
            System.out.println("Good Day");
        } else if (userInputNumber > 17 && userInputNumber < 23) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Wrong Input value");
        }


    }
}


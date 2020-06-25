package com.itstep.Lesson14;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter a number from 0 to 9");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int number = Integer.parseInt(str);
        try {
            System.out.println("The inserted number is " + number);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Incorrect number");
        } finally {
            System.out.println("try to get insert another number");


        }

        System.out.println("Program is finished successfully");

    }
}


//
package com.itstep.Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter a number");
        int userInputNumber = scanner.nextInt();

        String result =(userInputNumber % 2 == 0) ? "Even number": "Odd number";
        System.out.println(result);

    }
}

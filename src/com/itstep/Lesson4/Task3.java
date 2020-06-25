package com.itstep.Lesson4;

import java.util.Scanner;

// The user enters the length of a line and a symbol which the line should be made of. Display a vertical
// line made of the entered symbol of the specified length. For example, if the user entered 2 and %,
// the output would be as follows:
//%
//%
//public class Task3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a length");
//        int length = scanner.nextInt();
//        System.out.println("Enter a symbol");
//        scanner.nextLine();
//        String symbol = scanner.nextLine();
//
//
//        for (int i=0;i<length;i++) {
//            System.out.println(symbol);
//        }
//
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length");
        int length = scanner.nextInt();
        System.out.println("Enter a symbol");
        scanner.nextLine();
        String symbol = scanner.nextLine();


        for (int i=0;i<length;i++) {
            System.out.println(symbol);
        }
        }


        }








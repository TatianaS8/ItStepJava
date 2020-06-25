package com.itstep.homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class mayFirst {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number");
//        int secondNumber = scanner.nextInt();
//
//        if (firstNumber < secondNumber) {
//            for (int i = firstNumber; i < secondNumber; i++) {
//                if (i % 2 == 1) {
//                    System.out.println(i);
//                }
//            }
//
//        } else if (secondNumber < firstNumber) {
//
//            for (int i = secondNumber; i < firstNumber; i++) {
//                if (i % 2 == 1) {
//                    System.out.println(i);
//                }
//            }
//        }    else {
//                System.out.println("The number are equal");
//            }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        int r, i;
        int start;
        int end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }
        System.out.println("The result odd numbers between range " + start + " and "+end+" are:");
        for (i = start; i <= end; i++) {
            r = i % 2;
            if (r == 1)
                System.out.println(i);
        }


    }
}







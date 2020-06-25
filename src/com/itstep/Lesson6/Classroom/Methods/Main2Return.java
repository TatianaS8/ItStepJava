package com.itstep.Lesson6.Classroom.Methods;

import java.util.Scanner;

public class Main2Return {
    //ex.1
//    static int myMethod(int x, int y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        //int result=myMethod(5,6);
//        //System.out.println(result);
//        System.out.println(myMethod(5, 6));
//    }

    //ex.2
//    static int getSmallestNumber(int num1, int num2) {
//        if (num1 < num2) {
//            return num1;
//        } else {
//            return num2;
//        }
//    }

    //    public static void main(String[] args) {
//        int result=getSmallestNumber(5,9);
//        System.out.println(result);
//
//    }
    //ex.3
//    public static int getSmallestNumber(int num1, int num2) {
//        if (num1 < num2) {
//            return num1;
//        } else {
//            return num2;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int firstNumber = sc.nextInt();
//        int secondNumber = sc.nextInt();
//        System.out.println(getSmallestNumber(firstNumber, secondNumber));
//    }
    //ex.4
    public static  String myName(String firstName, String lastName, int age){
        return firstName+" "+ lastName+ " I am "+ age;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        System.out.println(myName(firstName,lastName, 30));
    }


}

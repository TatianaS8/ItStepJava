package com.itstep.Lesson6;

import java.util.Scanner;

public class MyClass {
    //    static void myMethod(){
//        System.out.println("I just got executed");
//    }
//
//    public static void main(String[] args) {
//        myMethod();
//    }
//    static void myMethod(String name, String age) {
//        System.out.println("My name is "+name);
//        System.out.println("I am " + age + " years old");
//    }
//
//    public static void main(String[] args) {
//        myMethod("Constantin", "18");
//        myMethod(" Alexei", "22");
//        myMethod("Diana","33");
//
//    }

    static void myMethod() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }

        public static void main (String[] args) {
//            myMethod();
//            myMethod();
            for (int i = 0; i < 3; i++) {
            myMethod();
        }



    }
}




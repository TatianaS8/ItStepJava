package com.itstep.Lesson6.Classroom.Methods;

import java.util.Scanner;

public class Main1Scanner {
    static void myMethod(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();

        System.out.println("My name is "+ name);
        System.out.println("I am "+age+" years old");

    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

       // metoda va fi implementata de 10 ori
        for (int i=0; i<10; i++){
            myMethod();
        }
    }
}

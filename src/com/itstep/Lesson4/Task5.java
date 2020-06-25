package com.itstep.Lesson4;
//Display a multiplication table in the range specified by the user. For example, if the user entered 3 and 5, the table may be as follows:
//3*1 = 3
//3*2 = 6
//3*3 = 9
// ............
//3* 10 = 30
//......................................................
//5*1 = 5
// 5 *2 = 10
//5 *3 = 15.....................

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(firstNumber + "*" + i + "=" + firstNumber * i);}

        for (int i1=1; i1<=10; i1++){
            System.out.println(secondNumber + "*" + i1 + "=" + secondNumber * i1);
            };


        }
    }
           //System.out.println("sum:" + sum);}

    //firstNumber+"*"+i+"="+firstNumber*i





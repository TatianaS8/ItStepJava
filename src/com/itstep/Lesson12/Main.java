package com.itstep.Lesson12;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] myArray=new int[]{0,1,2};
        for (int i=0; i<=myArray.length; i++){
        try {
            System.out.println(myArray[i]);
        }  catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("My array doesn t have the index" + i + "because the maximum index is " + (myArray.length - 1));
        }
        finally {
            System.out.println("try to get element by index" +i);




            }
    }
        System.out.println("Program is finished successfully");

    }
}
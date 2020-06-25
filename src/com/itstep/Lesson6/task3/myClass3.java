package com.itstep.Lesson6.task3;
//write a method that returns the largest of four numbers. Numbers are passed as parameters.

public class myClass3 {
    static int largestOfFourNumbers(int a, int b, int c, int d) {
        int max;
        max=a;
        int [] array=new int[] {a,b,c,d};
        for (int i =0;i<4; i++ ) {
            if (array[i]>max)
            {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        System.out.println(largestOfFourNumbers(9,-5,3,1));

    }


}


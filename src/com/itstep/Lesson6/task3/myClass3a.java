package com.itstep.Lesson6.task3;
public class myClass3a {
    static void largestOfFourNumbers(int array[]){
        int maximum = array[0];
        for (int i =0;i<4; i++ ) {
            if (array[i] > maximum) ;
            {
                maximum = array[i];
            }
        }
        System.out.println("Maximum value:"+maximum);
    }

    public static void main(String[] args) {
        largestOfFourNumbers(new int []{5, 5, 0, 8});
    }
}


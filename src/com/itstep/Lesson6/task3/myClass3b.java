package com.itstep.Lesson6.task3;

public class myClass3b {
    static void largestOffNumbers (int a, int b, int c, int d) {
        int max;
        int [] array=new int[] {a,b,c,d};
        max=a;
        for (int i =0;i<4; i++ ) {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }

    public static void main(String[] args) {
        largestOffNumbers(9,7,-5,1);
    }

}


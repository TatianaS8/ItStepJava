package com.itstep.Lesson6.task4;

public class myClass4 {
    static boolean checksIfNumberIsPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n / 2; i++)
            if (n % i == 0) {
                return false;
            }

                return true;
            }


        public static void main (String[]args){
            boolean a = checksIfNumberIsPrime(-5);

            System.out.println(a);

        }
    }

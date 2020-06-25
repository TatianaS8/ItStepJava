package com.itstep.Lesson7;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(6));
        System.out.println(random.nextLong());
        System.out.println(random.nextDouble());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextInt(100)+random.nextDouble());


    }

    }


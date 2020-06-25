package com.itstep.Lesson.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.setBrand("BMW");
        myCar.setHp(100);
        myCar.honk();
        System.out.println(myCar);

        Sedan sedan=new Sedan();
        sedan.setBrand("Sedan");
        sedan.setSeats(3);
        System.out.println(sedan);
        sedan.honk();


    }
}

package com.itstep.Lesson6.Classroom.Object;

public class Human {
    String name;
    int age;
    int heightInCm;
    String eyeColor;

//    public Human() {
//
//    }
    public Human (String name,int heightInCm, String eyeColor){
        this.name=name;
        this.heightInCm=heightInCm;
        this.eyeColor=eyeColor;
        this.age=0;

    }

    public void speak() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + heightInCm + " cm tall");
        System.out.println("I have "+ eyeColor+ " eyes color");
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public int getBirthYear() {
        return 2020 - age;
    }
}

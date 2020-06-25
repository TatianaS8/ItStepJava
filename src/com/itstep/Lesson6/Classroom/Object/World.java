package com.itstep.Lesson6.Classroom.Object;

public class World {
    public static void main(String[] args) {

        Human human1;
        human1 = new Human("Tatiana", 160, "green");
        human1.age=30;
        human1.eyeColor="blue";
        human1.speak();
        human1.walk();

        Human human2=new Human("Valeria", 166, "brown");
        human2.age=18;
        human2.speak();
        human2.walk();






    }
}


package com.itstep.Lesson6.task5;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Moldova", "Chisinau", "V.alecsandri", 115);
        Address address2 = new Address("Moldova", "Chisinau", "Ismail", 105);

        Job job1 = new Job("economist" + address2);

        Human human1 = new Human("Helen", "Monroe", 25);
        human1.speak();
        human1.rest();
        Human human2 = new Human("David", "Macon", 30);
        human2.speak();
        human2.rest();


    }
}

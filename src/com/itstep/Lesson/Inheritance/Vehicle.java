package com.itstep.Lesson.Inheritance;

public class Vehicle {

    protected String brand;

    public void honk(){
        System.out.println("Tuut");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }
}

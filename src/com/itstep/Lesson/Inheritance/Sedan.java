package com.itstep.Lesson.Inheritance;

public class Sedan extends Car {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

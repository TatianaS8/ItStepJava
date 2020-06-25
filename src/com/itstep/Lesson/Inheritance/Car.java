package com.itstep.Lesson.Inheritance;

public class Car extends Vehicle{
    private int hp=12;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", brand=' "+brand+'\''+
                '}';
    }
}

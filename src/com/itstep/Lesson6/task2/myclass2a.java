//Write a method that display a horizontal or vertical line made of a symbol.
// The method takes the following as parameters:line length, direction, symbol.
package com.itstep.Lesson6.task2;

public class myclass2a {
    static void task2(int length, String symbol, boolean isVertical) {
        for (int i = 1; i <= length; i++)
        {
            System.out.print(symbol);
            if (isVertical) {
                System.out.println();
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        task2(3, "g", false);
        task2(4, "%", true);
    }
}



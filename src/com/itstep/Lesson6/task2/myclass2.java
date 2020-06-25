package com.itstep.Lesson6.task2;

//Write a method that display a horizontal or vertical line made of a symbol.
// The method takes the following as parameters:line length, direction, symbol.
public class myclass2 {
    static void displayHorizontalVertical(int length, String symbol, String direction) {
        switch (direction) {
            case "vertical":
                for (int i = 0; i < length; i++) {
                    System.out.println(symbol);
                }
                break;
            case "horizontal":
                for (int i = 0; i < length; i++) {
                    System.out.print(symbol + " ");
                }
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
        System.out.println();
    }

    public static void main(String[] args) {

        displayHorizontalVertical(3,"%","vertical");
        displayHorizontalVertical(2,"*","horizontal");
        displayHorizontalVertical(4,"6","gfgf");

    }
}


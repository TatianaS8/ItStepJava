package com.itstep.Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println ("Enter a number of meters");
        int numberOfMeters = scanner.nextInt();

        Scanner scanner2 =new Scanner (System.in);
        System.out.println ("What would you like to convert to? (miles/yards/inches");
        String answer = scanner2.nextLine();

        float milesNR = numberOfMeters * 0.00062137f;
        float yardsNR = numberOfMeters * 0.09144f;
        float inchesNR = numberOfMeters * 39.3701f;

        switch (answer) {
            case "miles":
                System.out.println(numberOfMeters + " meters= " + String.format("%.3f",milesNR) + " miles");
                break;
            case "yards":
                System.out.println(numberOfMeters + " meters= " + String.format("%.3f",yardsNR) + " yards");
                break;
            case "inches":
                System.out.println(numberOfMeters + " meters= " + String.format("%.3f",inchesNR) + " inches");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}

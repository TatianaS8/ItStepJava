package com.itstep.Lesson11;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> number = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 number");
        for (int i = 0; i <= 6; i++) {
            number.add(scanner.nextInt());
        }
        System.out.println();

    }

}

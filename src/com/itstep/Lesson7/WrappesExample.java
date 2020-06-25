package com.itstep.Lesson7;

public class WrappesExample {
    public static void main(String[] args) {
        Integer myInt=10;
        String myString=myInt.toString();
        System.out.println(myString.length());
        System.out.println(myString);
        String asInt="20";
        int parsedInt=Integer.parseInt(asInt);
        System.out.println(asInt);
        System.out.println(parsedInt);
        int a=10;
        System.out.println(String.valueOf(a));
       
    }
}

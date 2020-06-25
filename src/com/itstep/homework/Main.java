package com.itstep.homework;

import com.itstep.Lesson17.Classroom.Address;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Address2020> addresses=new ArrayList<>();
        addresses.add(new Address2020("Moldova", "Chisinau", "Florilor", 31));
        addresses.add(new Address2020("SUA", "Ney York", "Main", 67));
        addresses.add(new Address2020("Romania", "Brasov", "M. Viteazul", 1));
        System.out.println("Initial list is: "+ addresses);
        //Collections.sort(addresses);
        System.out.println("Sorted list is: "+ addresses);





    }
}

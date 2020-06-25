package com.itstep.Lesson10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        CharList c1=new CharList();
        CharList c2=new CharList("String");


        ArrayList<Character> chars = new ArrayList<>();
        Collections.addAll(chars,'h','e','l','l','o');

        CharList c3 = new CharList(chars);
        System.out.println(c2.charList);
        //System.out.println(c3.charList);

        CharList cutCharList=c2.substring(0,2);
        System.out.println(cutCharList.charList);

        ArrayList<Character> att = new ArrayList<>();
//        Collections.addAll(1, )



        System.out.println();

    }


}

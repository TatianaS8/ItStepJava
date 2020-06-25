package com.itstep.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;

public class CharList {
    public ArrayList<Character> charList;

    public CharList(ArrayList<Character> charList) {
        this.charList = charList;
    }

    public CharList(){
        this.charList=new ArrayList<>();
    }

    public CharList(String string){
        //split each character and add it to the list
        //charList=new ArrayList<>();
        this.charList=new ArrayList<>();

        int stringLength=string.length();
        for (int i=0; i<stringLength; i++){
            charList.add(string.charAt(i));
        }
    }
    public char charAt(int index){
        return charList.get(index);


    }

    public CharList substring(int start, int end){
        ArrayList<Character>collected=new ArrayList<>();
        for (int i=start; i<=end; i++){
            collected.add(charList.get(i));
        }
        return new CharList(collected);
    }
   // charList mixedList()




}

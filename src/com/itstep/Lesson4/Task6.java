//The user enters elements of a one-dimensional array from the keyboard. Find the sum and arithmetic mean
// of the array element; display all elements of the array.
package com.itstep.Lesson4;

import java.util.Scanner;

public class Task6{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n,sum=0;
        float average;
        System.out.print("Enter no. of elements you want in array:");
        n=scanner.nextInt();
        int[]array=new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i<n; i++) {
            int arr[]=new int[n];
            array[i] = scanner.nextInt();
       }
        for (int i:array){
            System.out.print(i+",");}

            for(int i=0;i<n; i++){
      sum=sum+array[i];}
      System.out.println("Sum: "+sum);
      average=(float)sum/n;
      System.out.format("Average is: "+average);
    }





        }

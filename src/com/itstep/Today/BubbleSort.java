package com.itstep.Today;

public class BubbleSort {
    public static int[] getArray() {
        int size = 10000;
        int[] array = new int[size];
        int item = 0;
        for (int i = 0; i < size; i++) {
            item = (int) (Math.random() * 100000);
            array[i] = item;
        }
        return array;
    }

    public static int[] BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }



}



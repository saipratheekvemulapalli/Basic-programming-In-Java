package com.demo.zjavawithaws;

public class FindMinMaxofArray {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19, 1, 30, -5, 18}; 

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
            if (array[i] > max) {
                max = array[i]; 
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}


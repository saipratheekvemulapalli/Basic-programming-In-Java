package com.demo.zjavawithaws;

import java.util.Arrays;

public class BubbleSort {

    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
//        int n = arr.length;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//
//        }
//        
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        
        
        
        for(int i=0;i<arr.length;i++) {
        	for(int j=i;j<arr.length;j++) {
        		if(arr[i]>arr[j]) {
        			int temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(arr));
        
      

       
    }
}


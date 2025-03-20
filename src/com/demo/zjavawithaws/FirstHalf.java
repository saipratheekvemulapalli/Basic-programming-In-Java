package com.demo.zjavawithaws;

public class FirstHalf {

    public static String firstHalf(String str) {
        int mid = str.length() / 2;
        
        return str.substring(0, mid);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));      
        System.out.println(firstHalf("HelloThere"));  
        System.out.println(firstHalf("abcdef"));      
    }
}


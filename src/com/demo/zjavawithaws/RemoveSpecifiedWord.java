package com.demo.zjavawithaws;

public class RemoveSpecifiedWord {

    public static void main(String[] args) {
        System.out.println(removeWord("Exercises Practice Solution", "Solution")); 
        System.out.println(removeWord("Red Green Blue", "Green"));                
        System.out.println(removeWord("Java Number Exercises", "Java"));          
    }

    public static String removeWord(String text, String word) {
        return text.replaceAll(text, word);//.replaceAll("\\s+", " ").trim();
    }
}

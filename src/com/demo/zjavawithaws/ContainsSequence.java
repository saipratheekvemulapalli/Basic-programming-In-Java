package com.demo.zjavawithaws;

public class ContainsSequence {
    public static void main(String[] args) {
        // Original string
        String originalString = "PHP Exercises and Python Exercises";
        
        // Specified sequence to check
        String specifiedSequence = "and";
        
        // Check if the original string contains the specified sequence
        boolean contains = originalString.contains(specifiedSequence);
        
        // Output the result
        System.out.println("Original String: " + originalString);
        System.out.println("Specified sequence of char values: \"" + specifiedSequence + "\"");
        System.out.println("Output: " + contains);
    }
}


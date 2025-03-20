package com.demo.zjavawithaws;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        input = input.toLowerCase();
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        
        char maxChar = '\0';
        int maxCount = 0;
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        
        System.out.println("The given string is: " + input);
        System.out.println("Max occurring character in the given string is: " + maxChar);
        
        scanner.close();
    }
}

package com.demo.zjavawithaws;

import java.util.HashMap;
import java.util.Map;

public class CheckLettersInStrings {

    public static boolean areAllLettersPresent(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false; 
            }
           
            map.put(ch, map.get(ch) - 1);
        }

        return true; 
    }

    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Grim";

        boolean result = areAllLettersPresent(str1, str2);
        System.out.println(result);
    }
}

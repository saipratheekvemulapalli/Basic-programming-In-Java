package com.demo.zjavawithaws;

public class RemoveSpecifiedCharacter {

	public static void main(String[] args) {
        String original = "abcdefabcdeabcdaaa";
        char toRemove = 'a'; 

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char current = original.charAt(i);
            if (current != toRemove) {
                result.append(current); 
            }
        }

        System.out.println("Original string: " + original);
        System.out.println("Character to remove: " + toRemove);
        System.out.println("Modified string: " + result.toString());

	}

}

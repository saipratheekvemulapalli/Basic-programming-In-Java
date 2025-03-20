package com.demo.zjavawithaws;
import java.util.Scanner;

public class RepeatCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        StringBuilder newString = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            newString.append(input.charAt(i)).append(input.charAt(i));
        }
        
        System.out.println("The given string is: " + input);
        System.out.println("The new string is: " + newString.toString());
        
        scanner.close();
    }
}

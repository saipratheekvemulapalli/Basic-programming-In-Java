package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EachVowelCount {

	public static void main(String[] args) {
		
		String str = "Capgemini Training";
		
	
		
		int count=0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
		
		
		List<Character> list10 = List.of('a','e','i','o','u');
		
		char[] charrar= str.toCharArray();
		
		List<Character> list11 = new ArrayList<>();
		
		for(char c:charrar) {
			list11.add(c);
		}
		
		int flag=0;
		for(int i=0;i<list11.size();i++) {
			if(list11.contains(list10.get(i))) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("jaja");
		}
		else {
			System.out.println("haha");
		}
		
		
		
		
	}
	
	public static boolean checkAllVowelsarePresentOrNot() {
		String str = "Education is the key to success";
		
		Set<Character> vowelset = Set.of('a','e','i','o','u');
		HashSet<Character> resultset = new HashSet<>();
		
	
		 str.toLowerCase().chars().mapToObj(c->(char)c).filter(m->vowelset.contains(m)).forEach(resultset::add);
		
		return resultset.containsAll(vowelset);
		
	}
	
//	import java.util.*;
//
//	public class Main {
//	    public static void main(String[] args) {
//	        String str = "Capgemini Training";
//	        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
//	        
//	        // Convert string to lowercase to handle case-insensitivity
//	        str = str.toLowerCase();
//
//	        // Iterate over each character in the string
//	        boolean allVowelsPresent = true;
//	        for (char c : vowels) {
//	            if (!str.contains(String.valueOf(c))) {
//	                allVowelsPresent = false;
//	                break; // No need to check further once we know a vowel is missing
//	            }
//	        }
//
//	        // Output result
//	        if (allVowelsPresent) {
//	            System.out.println("haha");
//	        } else {
//	            System.out.println("jaja");
//	        }
//	    }
//	}

	
	

}

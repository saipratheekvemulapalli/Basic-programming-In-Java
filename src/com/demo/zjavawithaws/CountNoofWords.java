package com.demo.zjavawithaws;

public class CountNoofWords {

	public static void main(String[] args) {
		
		String sentence = "This is a   test\nsentence \twith mixed   separators.";
		
		String[] arr = sentence.trim().split("[ \\s]+");
		
		System.out.println(arr.length);
		
	
	}

}

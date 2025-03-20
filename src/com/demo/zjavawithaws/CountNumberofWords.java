package com.demo.zjavawithaws;

import java.util.Arrays;

public class CountNumberofWords {

	public static void main(String[] args) {
		
		String str = "Hello World java";
	
		String[] splitwords = str.trim().split("[ \\s]+");
		System.out.println(splitwords.length);
		
		
		

	}

}

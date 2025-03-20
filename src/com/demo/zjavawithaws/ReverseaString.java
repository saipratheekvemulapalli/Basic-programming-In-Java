package com.demo.zjavawithaws;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Capgemini Training";
		
		//method 1
		String revstr = "";
		for(int i=0;i<str.length();i++) {
			revstr = str.charAt(i)+revstr;
		}
		System.out.println(revstr);
		
		//method2
		
		String sBuilder = new StringBuilder(str).reverse().toString();
		System.out.println(sBuilder);
		
		//method 3
		
		String revstr1 = str.chars().mapToObj(s->(char)s).sorted(Collections.reverseOrder()).map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(revstr1);
	}
	
	
	
	

}

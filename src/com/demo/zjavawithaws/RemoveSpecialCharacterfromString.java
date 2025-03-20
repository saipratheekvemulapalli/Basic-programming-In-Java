package com.demo.zjavawithaws;

public class RemoveSpecialCharacterfromString {

	public static void main(String[] args) {
		String str1= "kjsdcduio87178^338!#*(#";
		
		str1=str1.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(str1);

	}

}

package com.demo.zjavawithaws;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Capgemini";
		//method1
		
		String revstr1 = new StringBuilder(str).reverse().toString();
		System.out.println(revstr1);
		
		//method2
		String revstr2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			revstr2 = revstr2+str.charAt(i);
		}
		
		System.out.println(revstr2);
	}

}

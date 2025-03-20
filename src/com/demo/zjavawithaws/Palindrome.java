package com.demo.zjavawithaws;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		
		
		// method1
		
		String revstr = "";
		
		for(int i=0;i<str.length();i++) {
			revstr = str.charAt(i)+revstr;
		}
		System.out.println(revstr);
		System.out.println(str);
		if(str.equals(revstr)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		//method 2
		
		String revStr2 = new StringBuilder(str).reverse().toString();
		
		String toprint = revStr2.equals(str)?"is Palindrome":"not a plaindrome";
		System.out.println(toprint);

	}

}

package com.demo.zjavawithaws;

public class CheckNoDigitsArePresent {

	public static void main(String[] args) {
		
		String str = "jsda1j";
		
		int flag=0;
		
		for(int i=0;i<str.length();i++) {
			if(!(Character.isLetter(str.charAt(i)))||Character.isSpace(str.charAt(i))) {
				flag=1;
				
				break;
			}
		}
		if(flag==1) {
			System.out.println("Contains Numbers and spaces");
		}
		else {
			System.out.println("Contains only alphabets");
		}
		

	}

}

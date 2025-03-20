package com.demo.zjavawithaws;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=103901;
		int cpnum = num;
		int revnum=0;
		
		while(num>0) {
			int rem=num%10;
			revnum = revnum*10+rem;
			num=num/10;
		}
		if(cpnum==revnum) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("not palindrome");
		}
		

	}

}

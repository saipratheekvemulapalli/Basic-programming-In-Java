package com.demo.zjavawithaws;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=34;
		int flag=0;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is composite");
		}

	}

}

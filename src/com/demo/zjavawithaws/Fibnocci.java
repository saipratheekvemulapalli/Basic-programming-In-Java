package com.demo.zjavawithaws;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int count=0;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<100 && count<20;i++) { // upto 10
			int temp =a+b;
			count++;
			if(temp<100) {
				System.out.print(temp+" ");
			}
			a=b;
			b=temp;
		}

	}

}

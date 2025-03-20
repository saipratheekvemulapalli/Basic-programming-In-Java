package com.demo.zjavawithaws;

public class DesignPrimeNumber {

	public static void main(String[] args) {
		
		boolean comma = false;
		
		for(int i=2;i<=30;i++) {
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				if(comma==true) {
					System.out.print(",");
				}
				System.out.print(i);
				comma=true;
			}
		}

	}

}

package com.demo.zjavawithaws;

import java.util.Iterator;

public class Lshapestar {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==5 || j==1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}

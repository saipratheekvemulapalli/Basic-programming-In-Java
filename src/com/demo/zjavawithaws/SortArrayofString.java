package com.demo.zjavawithaws;

import java.util.Arrays;

public class SortArrayofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] arr = {"capgemini", "tcs", "accenture", "epam"};
		//method1
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

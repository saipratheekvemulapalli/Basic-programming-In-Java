package com.demo.zjavawithaws;

import java.util.HashSet;

public class MissingNumbersInArray1to100 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,7,9,100};
		
		HashSet<Integer> set =  new HashSet<>();
		
		for(int i=1;i<=100;i++) {
			set.add(i);
		}
		
		for(int num:arr) {
			set.remove(num);
		}
		System.out.println(set);

	}

}

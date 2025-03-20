package com.demo.zjavawithaws;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,6,1,0};
		//method1
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
			
		List<Integer> list = Arrays.asList(2,3,5,6,1,0); //0,1,2,3,5,6
		int lastsecond = list.stream().sorted().skip(list.size()-2).findFirst().get();
		System.out.println(lastsecond);
	}

}

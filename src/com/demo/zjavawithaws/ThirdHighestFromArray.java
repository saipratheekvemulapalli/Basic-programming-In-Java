package com.demo.zjavawithaws;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdHighestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//normal method
		int[] arr = {12,984,71,72,4,3}; //3,4,12,71,72,984
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-3]);
		
		List<Integer> list = Arrays.asList(12,984,71,72,4,3);
			int thirdmax = list.stream().sorted(Collections.reverseOrder()).skip(2).findFirst().get();
			
			System.out.println(thirdmax);
	}

}

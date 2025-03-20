package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,1,43,1234,46765,32,456);
		int max = list.stream().max(Integer::compareTo).
				get();
		System.out.println(max);
		
//		int max2 = list.stream().mapToInt(Integer::intValue).max().orElse();
//		System.out.println(max2);
		
		int max3 = list.stream().sorted().skip(list.size()-1).findFirst().get();
		System.out.println(max3);
	}

}

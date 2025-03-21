package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class DistinctSquares {

	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,3,5,6,7,74,3,2,2,12);
		
		List<Integer> list2 = list.stream().distinct().map(x->x*x).toList();
		
		System.out.println(list2);
		
	}

}

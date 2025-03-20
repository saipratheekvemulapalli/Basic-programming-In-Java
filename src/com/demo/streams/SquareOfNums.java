package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = Arrays.asList(1,3,4,6,3,2,21,324);
		List<Integer> list2 = list.stream().map(s->s*s).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}

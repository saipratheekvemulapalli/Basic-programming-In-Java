package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Evennums {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,4,3,2,4,6,8,92,223);
		
		List<Integer> list2 = 
				list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(list2);
		

	}

}

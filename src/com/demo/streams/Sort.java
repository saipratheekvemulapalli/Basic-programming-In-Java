package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,5,6,3,2,4,6,8,999,23,45,213,4253,232);
			
			list =	list.stream().sorted().collect(Collectors.toList());
		
				System.out.println(list);
				
				
				
				int a=12;
				int b=3;
				System.out.println(a+b);
				System.out.println(a-b);
	}

}

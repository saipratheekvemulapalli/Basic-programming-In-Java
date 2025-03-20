package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
	
	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,3,4,6,7,8,9,194,5,5614,4,123,1235,23422,8721);
		
		List<String> list2 = list.stream().map(s->s+"").filter(s->s.startsWith("1")).toList();
		System.out.println(list2);
		
		//counting How many number that starts with 1.
		int count = (int) list.stream().map(s->s+"").filter(x->x.startsWith("1")).count();
		
		System.out.println(count);
		
		
	}

}

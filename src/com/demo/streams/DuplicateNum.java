package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNum {

	public static void main(String[] args) {
		
		
		
		
		Integer[] arr = {1,2,3,4,4,4,2,21};
		
		List<Integer> list=  Arrays.asList(arr);
		Set<Integer> set  = new HashSet<>();
		
		//set.addAll(list);
		//System.out.println(set);
		
		list.stream().filter(s->!set.add(s)).collect(Collectors.toList());
		System.out.println(set);
		
		List<Integer> list2 = new ArrayList<>();
				list.stream().filter(n->{
			if(!list2.contains(n)) {
				list2.add(n);
			}
				return false;
		}).collect(Collectors.toList());
				
				System.out.println(list2);
		
	}

}

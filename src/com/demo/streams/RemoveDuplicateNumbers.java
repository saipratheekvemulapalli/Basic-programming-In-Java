package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,35,66,7,884,4,2,2,3,1);
		
		//Approach1
		Set<Integer> set = new HashSet<>();
		
		list.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println(set);
		
		
		//Approach2
		List<Integer> list2 = new ArrayList<>();
		
		list.stream().filter(z->{
			if(!list2.contains(z)) {
				list2.add(z);
			}
			return false;
		}).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//Approach3 
		List<Integer> list11 = list.stream().distinct().toList();
		
		System.out.println(list11);
		
		// Now print only duplicate
		
		Set<Integer> duplicateSet = new HashSet();
		System.out.println("-------------------------------------------");
		
		list.stream().filter(s->!duplicateSet.add(s)).forEach(System.out::println);
		System.out.println(duplicateSet);
		
	}

}

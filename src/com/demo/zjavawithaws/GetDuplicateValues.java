package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetDuplicateValues {

	public static void main(String[] args) {
		//get the duplicate values
		List<Integer> list = Arrays.asList(1,2,3,45,1,2,3);
		
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(n->n.getValue()>1L)
				.collect(Collectors.toMap(w->w.getKey(), w->w.getValue()));
		
		System.out.println(map);
		
		// get unique values
		List<Integer> list2= new ArrayList<>();
		List<Integer> resultlist = list.stream()
				.filter(n->{
					if(!list2.contains(n)) {
						list2.add(n);
					}
					return false;
				}).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//get unique values by set
		
		Set<Integer> set = new HashSet<>();
				
		list.stream().filter(s->!set.add(s)).forEach(o->resultlist.add(o));
				
				System.out.println(resultlist);
		

	}

}

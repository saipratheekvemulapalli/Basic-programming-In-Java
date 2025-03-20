package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(List.of(11,23,4,73,78,91,62));
		
		//method 1
		
		for(int i=0;i<list1.size();i++) {
			for(int j=i+1;j<list1.size();j++) {
				if(list1.get(i)>list1.get(j)) {
					int temp = list1.get(i);
					list1.set(i, list1.get(j));
					list1.set(j, temp);
				}
			}
		}
		System.out.println(list1);
		
		//method 2
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//method 3
		
		List<Integer> resultlist = list1.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
		
		System.out.println(resultlist);

	}

}

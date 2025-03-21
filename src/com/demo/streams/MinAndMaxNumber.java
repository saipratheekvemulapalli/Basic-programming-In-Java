package com.demo.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(18,2,4,5,6,7,82,8,95,92,94);
		
		//Approach1 -> using inbuilt sort comparator 
		int min1 = list.stream().sorted().findFirst().get();
		System.out.println(min1);
		
		int max1 = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(max1);
		
		//Approach2 -> using collections sort
		
		Collections.sort(list);
		int min2 = list.stream().findFirst().get();
		System.out.println(min2);
		
		Collections.sort(list,Collections.reverseOrder());
		int max2 = list.stream().findFirst().get();
		System.out.println(max2);
		
		// Approach3 -> using skip method
		
		int min3 = list.stream().sorted().findFirst().get();
		System.out.println(min3);
		
		int max3 = list.stream().sorted().skip(list.size()-1).findFirst().get();
		System.out.println(max3);
		
		
		//Approach4 -> using Max and Min method 
		
		int min4 = list.stream().min(Integer::compareTo).get();
		System.out.println(min4);
		
		int max4 = list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(max4);
		
		//Approach5 -> using maptoint
		
		int min5 = list.stream().mapToInt(n->n).min().getAsInt();
		System.out.println(min5);
		
		int max5 = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(max5);
		
	}

}

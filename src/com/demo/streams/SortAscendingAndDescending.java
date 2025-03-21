package com.demo.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAscendingAndDescending {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(133,385,44,35,76,22,43,6,776);
		
		//Asc
		 List<Integer> list2 = list.stream().sorted().toList();
		 System.out.println(list2);
		 
		 //Desc
		 List<Integer> list3 = list.stream().sorted(Comparator.reverseOrder()).toList();
		 System.out.println(list3);
		
		
		
		
	}

}

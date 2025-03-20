package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
		//List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,63,238);
		
		int[] arr  =  {1,34,4,6,62};
		
		//List<Integer> list = Arrays.stream(arr).boxed().toList();
		
		List<Integer> list  =  List.of(1,2,3,4,5,54,53);
		
		List<Integer> list2 =  list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(list2);
	}

}

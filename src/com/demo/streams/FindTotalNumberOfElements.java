package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumberOfElements {

	public static void main(String[] args) {
	
		
		List<Integer> list = Arrays.asList(1,2,4,45,5,6);
		
		int c = (int) list.stream().count();
		
		System.out.println(c);
	}

}

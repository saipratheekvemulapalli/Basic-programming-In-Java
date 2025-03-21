package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StringsLenGreaterThan5 {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Dell","HP","Lenovo","Acer","Apple");
		
		List<String> list2 = list1.stream().filter(x->x.length()>5).toList();
		
		System.out.println(list2);
	}

}

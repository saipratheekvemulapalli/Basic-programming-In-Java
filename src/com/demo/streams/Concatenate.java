package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concatenate {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("Dell","HP","Lenovo","Acer","Apple");
		
		List<String> list2 = Arrays.asList("Oneplus","Oppo","Vivo","Xiomi","Realme");
		
		List<String> concateList = Stream.concat(list1.stream(), list2.stream()).toList();
		System.out.println(concateList);
	}

}

package com.demo.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Noofchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Capgemini";
		
		Map<Character, Long> map = str.toLowerCase().chars()
				.mapToObj(s->(char) s)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
	}

}

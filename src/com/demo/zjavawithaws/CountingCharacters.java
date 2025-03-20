package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingCharacters {

	public static void main(String[] args) {
		String str = "capgemini";
		
		Map<Character, Long> map = str.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
			System.out.println(map);
	}

}

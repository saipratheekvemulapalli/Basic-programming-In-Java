package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SpecificOccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		char ch = 'l';
		Map<Character, Long> map = str.chars().mapToObj(s->(char)s).filter(s->s==ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
	}

}

package com.demo.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatationOfCharacters {

	public static void main(String[] args) {
String str = "Java is a programming language";
		
		Map<Character, Long> map =  str.trim().replaceAll(" ", "").chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
		
	}

}

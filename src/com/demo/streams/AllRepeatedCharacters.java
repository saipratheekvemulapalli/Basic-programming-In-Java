package com.demo.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllRepeatedCharacters {

	public static void main(String[] args) {
		
String str = "Java is a programming language";
		
		Map<Character, Long> map  = str.toLowerCase().strip().replaceAll(" ", "").chars().mapToObj(s->(char)s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(map);
		
	}

}

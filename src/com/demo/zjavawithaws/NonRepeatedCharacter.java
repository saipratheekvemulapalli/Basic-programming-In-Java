package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		
		Character chars= str.chars().mapToObj(s->(char)s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(q->q.getValue()==1L).map(k->k.getKey()).findFirst().get();
		
		System.out.println(chars);
	
	}

}

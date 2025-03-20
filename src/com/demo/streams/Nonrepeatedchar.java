package com.demo.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nonrepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is a programming language";
		Character ch1 = str.toLowerCase().chars()
				.mapToObj(ch->(char)ch)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1L).map(e->e.getKey()).findFirst().get();
		
		System.out.println(ch1);
	}

}

package com.demo.streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharcter {

	public static void main(String[] args) {
		
		String str = "Java is a programming language";
		
		Character cha = str.toLowerCase().strip().replaceAll(" ", "").chars().mapToObj(s->(char)s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
		System.out.println(cha);
		
		// If you want to find the second non-repeated character ->using .skip() method
		Character cha1 = str.toLowerCase().strip().replaceAll(" ", "").chars().mapToObj(s->(char)s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).skip(1).findFirst().get();
		System.out.println(cha1);
	}

}

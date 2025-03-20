package com.demo.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedchar {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		
//		Character cha = str.chars().mapToObj(s->(char) s)
//				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//				.entrySet().stream().filter(e->e.getValue()>1L).map(e->e.getKey()).findFirst().get();
//				
//		System.out.println(cha);
		
		
//		Character cha = str.chars().mapToObj(e->(char) e)
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//				.entrySet().stream().filter(e->e.getValue()>1L).map(e->e.getKey()).findFirst().get();
//		
//		System.out.println(cha);
		
		
		Character cha = str.chars().mapToObj(s->(char)s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
		
		System.out.println(cha);
	
		
		
		
		
		
		
		
		
		

	}

}

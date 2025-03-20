package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstCharacterWhichIsNotRepeated {

	public static void main(String[] args) {
		
		String str1 = "sai pratheek";
		
		str1 = str1.replaceAll("\\s", "");
		
		Character ch1 = str1.toLowerCase().chars()
				.mapToObj(ch->(char)ch)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(n->n.getValue()==1L).map(n->n.getKey()).findFirst().get();
		System.out.println(ch1);
		

	}

}

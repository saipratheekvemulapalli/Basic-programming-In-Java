package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		
		//method1
		List<Character> list = Arrays.asList('a','b','c','d','e','a');
		
		List<Character> resultlist = new ArrayList<>();
		char ch =' ';
		
		for(int i=0;i<list.size();i++) {
			if(!resultlist.contains(list.get(i))) {
				resultlist.add(list.get(i));
			}
			else {
				ch = list.get(i);
				break;
			}
		}
		System.out.println(ch);
		
		//method2
		Character chars = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(n->n.getValue()>1).map(n->n.getKey())
				.findFirst().get();
		
		System.out.println(chars);

	}

}

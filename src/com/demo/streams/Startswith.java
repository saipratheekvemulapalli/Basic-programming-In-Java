package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startswith {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,19,10,11,343,123,425,21,23544,243,12556);
		
		List<String> list2 =  list.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(list2);
	
	}

}

package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWithComma {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("USA", "Japan", "france", "Germany", "Italy", "U.K.","Canada");
		List<String> list2;
		
		String result = list.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1)).collect(Collectors.joining(","));
		System.out.println(result);

	}

}

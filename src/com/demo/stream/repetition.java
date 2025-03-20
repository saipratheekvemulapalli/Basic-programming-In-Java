package com.demo.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class repetition {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(2,3,34,3,5,5,4,3,3,3);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

		System.out.println(map);
	}

}

package com.demo.zjavawithaws;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		int sum = list1.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		String str = "Pratheek";
		
		String tolow = Stream.of(str.split("")).map(String::toLowerCase)
				.collect(Collectors.joining());
		System.out.println(tolow);
		
		
		
		
	}

}

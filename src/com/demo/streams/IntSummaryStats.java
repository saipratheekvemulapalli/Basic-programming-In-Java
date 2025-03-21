package com.demo.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class IntSummaryStats {

	public static void main(String[] args) {
			
		List<Integer> list = Arrays.asList(1,2,4,5,1,21,5,61);
		
		IntSummaryStatistics stats = list.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		
		int sum =list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		Double avg = list.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(avg);
		
		Double avg2 = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avg2);
				
	}

}

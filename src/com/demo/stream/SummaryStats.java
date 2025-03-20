package com.demo.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStats {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = list.stream().mapToInt(n->n).summaryStatistics();
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		
	List<String> list2 = 	list.stream().map(s->s+"").filter(n->n.startsWith("1")).collect(Collectors.toList());
		
		System.out.println(list2);
	}

}

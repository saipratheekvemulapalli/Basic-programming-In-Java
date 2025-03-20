package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("laptop","mouse","CPU");
		List<String> list2 = Arrays.asList("Phone","Tab","Android");
		
		List<String> list3 = Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(list3);
	}

}

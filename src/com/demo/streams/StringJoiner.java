package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("India","Germany","Srilanka","Dubai","Russia","USA");
		
		String str = list.stream().map(x->x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()).collect(Collectors.joining());
		
		System.out.println(str);
	}

}

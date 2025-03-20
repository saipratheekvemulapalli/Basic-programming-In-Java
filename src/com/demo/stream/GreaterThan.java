package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("laptop","mouse","CPU","Phone","Tab","Android");
		
	List<String> list2=	list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(list2);
	}

}

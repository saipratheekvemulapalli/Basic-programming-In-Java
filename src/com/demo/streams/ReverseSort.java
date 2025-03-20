package com.demo.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,3,4,5,6,3,2,4,6,8,999,23,45,213,4253,232);
		list = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		
	}

}

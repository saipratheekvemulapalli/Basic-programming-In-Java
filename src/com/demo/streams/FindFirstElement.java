package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,73,51,891,653,63,91,79,80,63,90);
		
		int c1 = list.stream().findFirst().get();
		System.out.println(c1);
		
		
		
		
		
	}

}

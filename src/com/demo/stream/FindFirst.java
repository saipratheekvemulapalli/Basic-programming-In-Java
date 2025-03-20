package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);
		//Collections.sort(list,Collections.reverseOrder());
		int first = list.stream().findFirst().get();
		System.out.println(first);
		
		
	}

}

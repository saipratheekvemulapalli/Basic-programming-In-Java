package com.demo.stream;

import java.util.Arrays;
import java.util.List;

public class TotalCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);
		int count = (int) list.stream().count();
		System.out.println(count);
	}

}

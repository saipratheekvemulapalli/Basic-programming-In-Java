package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class Findlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);
		int last = list.stream().skip(list.size()-1).findFirst().get();
		System.out.println(last);

	}

}

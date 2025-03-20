package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckFirstStringHasSecondString {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Ja";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		
		for (char c : arr1) {
		    list1.add(c); 
		}
		for (char c : arr2) {
		    list2.add(c); 
		}
		
		boolean isThere = true;
		for(int i=0,j=0;i<list1.size() && j<list2.size();i++,j++) {
			if(!(list1.contains(list2.get(i)))) {
				isThere = false;
				break;
			}
		}
		if(isThere==true) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		

	}

}

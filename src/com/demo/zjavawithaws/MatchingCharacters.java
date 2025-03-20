package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MatchingCharacters {

	public static void main(String[] args) {
		
		//method 1 printing same characters in 2 strings
		String str1 = "abcdef";
		String str2 = "hcvsafs";
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i)==str2.charAt(j)) {
					strBuilder.append(str1.charAt(i));
				}
			}
			
		}
		System.out.println(strBuilder.toString());
		
		//method2 using streams
		String str3 = "Please subscribe to my channel";
		str3 = str3.replaceAll("\\s","");
		
		Map<Character, Long> map = str3.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1L)
				.collect(Collectors.toMap(x->x.getKey(), x->x.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(map);
		
		//remove spaces using streams
		String str4 = "Please subscribe to my channel";
		
		String resultofStr4 = str4.chars().filter(a->!Character.isWhitespace((char)a))
				.mapToObj(j->String.valueOf((char)j))
				.collect(Collectors.joining());
		System.out.println(resultofStr4);
		
	}

}

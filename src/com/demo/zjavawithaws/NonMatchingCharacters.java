package com.demo.zjavawithaws;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonMatchingCharacters {

	public static void main(String[] args) {
		//method 1
		String str1 = "xbcdef";
		String str2 = "hcvsafs";
		
		StringBuilder strBuilder = new StringBuilder();
		for(int i=0;i<str1.length();i++) {
			int flag=0;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)!=str2.charAt(j)) {
					flag=1;
				}else {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				strBuilder.append(str1.charAt(i));
			}
		}
		System.out.println(strBuilder.toString());
		
		
		//method 2
		String str3 = "Please subscribe to my channel";
		str3 = str3.replaceAll("\\s", "");
		
		Map<Character, Long>map =  str3.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1L)
				.collect(Collectors.toMap(x->x.getKey(), x->x.getValue(),(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(map);
				
				
				
	}

}

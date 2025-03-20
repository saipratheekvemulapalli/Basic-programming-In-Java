package com.demo.zjavawithaws;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNoofWordsInStringUsingHashmap {

	public static void main(String[] args) {
		String str1= "I am Ironman this word said by IronMan";
		
		String[] strarr = str1.split("\\s");
		
		System.out.println(Arrays.toString(strarr));
		
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<strarr.length;i++) {
			String word = strarr[i].toLowerCase();
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
	}

}

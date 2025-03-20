package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberInList {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(2,4,6,10,12,14,16,18,20);
		List<Integer> missinglist = new ArrayList<>();
		int flag=0;
		
		for (int i = 1; i <= 20; i ++) {
            if (!list.contains(i)) {
                missinglist.add(i);  
                flag = 1;
            }
        }
		if(flag==0) {
			System.out.println("no missing num");
		}
		System.out.println(missinglist);

	}

}

package com.demo.zjavawithaws;

import java.util.Arrays;

public class TwoStringsRotationMutually {

	public static void main(String[] args) {
		
		String str1 = "waterbottle";
		String str2 = "terbottlewa";
		
		if(str1.length()==str2.length()){
			String combinedstr1 = str1+str1;
			
			if(combinedstr1.contains(str2)) {
				System.out.println("both are rotational");
			}
			else {
				System.out.println("both are not rotational");
			}
		}
		else {
			System.out.println("both the string are not same");
		}
	}

}

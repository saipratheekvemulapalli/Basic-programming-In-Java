package com.demo.zjavawithaws;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class SortInAscendingandDescendingOrder {

	public static void main(String[] args) {
		
		
		
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
        
        
        //Alphabetical order
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        
        //Based on str length by using lambda
        Arrays.sort(colors,(a,b)->Integer.compare(a.length(), b.length()));  
        System.out.println(Arrays.toString(colors));
        
      //Based on str length by using lambda(desc)
        Arrays.sort(colors,(a,b)->Integer.compare(b.length(), a.length()));  
        System.out.println(Arrays.toString(colors));
        
        //based on sorting strlength by using anonymous class.(ASC)
        
        Arrays.sort(colors, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Integer.compare(o1.length(), o2.length());
			}
		});
        
        System.out.println(Arrays.toString(colors));

	}

}

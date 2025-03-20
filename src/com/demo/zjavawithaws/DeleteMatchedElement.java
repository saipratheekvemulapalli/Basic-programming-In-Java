package com.demo.zjavawithaws;

import java.util.LinkedList;

public class DeleteMatchedElement {

	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<>();
	        list.add(3);
	        list.add(7);
	        list.add(2);
	        list.add(7);
	        list.add(10);

	        System.out.println("Original List: " + list);

	        int target = 7;

	       for(int i=0;i<list.size();i++) {
	    	   if(list.get(i)==target) {
	    		   list.remove(i);
	    	   }
	       }
	            
	        

	        System.out.println("List After Removing " + target + ": " + list);

	}

}

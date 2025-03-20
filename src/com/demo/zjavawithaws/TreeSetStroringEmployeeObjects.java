package com.demo.zjavawithaws;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStroringEmployeeObjects {

	public static void main(String[] args) {
		
		Set<Employee> treeset = new TreeSet<>();
		treeset.add(new Employee(1,"Naruto", 10000));
		treeset.add(new Employee(2,"sauske", 83332));
		treeset.add(new Employee(3,"Itachi", 353535));
		treeset.add(new Employee(4,"Hashirama", 10242500));
		treeset.add(new Employee(5,"Minato", 433564));
		
		System.out.println(treeset);
	}

}

package com.demo.zjavawithaws;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortingCollection {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Ironman", 1000000));
		list.add(new Employee(2, "Hulk", 617822));
		list.add(new Employee(3, "Spiderman", 981871));
		list.add(new Employee(4, "Captainamerica", 81811));
		list.add(new Employee(5, "Thor", 819199188));
		list.add(new Employee(6, "Thanos", 817155));
		list.add(new Employee(7, "Doctorstrange", 8181763));
		
		List<Employee> resultlist = list.stream().sorted().toList();
		//System.out.println(resultlist);
		
		
		List<Employee> resultlistbyId = list.stream()
				.sorted(Comparator.comparing(Employee::getId))
				.collect(Collectors.toList());
		//System.out.println(resultlistbyId);
		
		List<Employee> sortbyIdnormalLambda = list.stream()
				.sorted((emp1,emp2)->Integer.compare(emp1.getId(), emp2.getId()))
				.collect(Collectors.toList());
		System.out.println(sortbyIdnormalLambda);
		
		
		
		

	}
	
	

}

package com.demo.zjavawithaws;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int	 salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}

	//1
	public Comparator<Employee> compareById(){
		return Comparator.comparing(employee->employee.getId());
	}
	//2
	public Comparator<Employee> compareByIdUsingFullLambda(){
		return (emp1,emp2)->Integer.compare(emp1.getId(),emp2.getId());
		
	}
	

}

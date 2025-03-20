package com.demo.zjavawithaws;


@FunctionalInterface
public interface CustomFunctionalInterface {
	
	void sayinghello();
	
	default void introduce() {
		System.out.println("This is Introduce method from CustomFunctionalInterface");
	}

}

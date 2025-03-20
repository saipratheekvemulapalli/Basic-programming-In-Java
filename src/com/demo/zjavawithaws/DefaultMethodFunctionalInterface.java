package com.demo.zjavawithaws;


class customclass implements CustomFunctionalInterface{

	@Override
	public void sayinghello() {
		System.out.println("Hello from customclass");
	}
	//public void introduce() {
	//	System.out.println("This is Introduce method from customclass");
	//}
	
}


public class DefaultMethodFunctionalInterface {

	public static void main(String[] args) {
		
		customclass cust = new customclass();
		cust.sayinghello();
		cust.introduce();
	}

}

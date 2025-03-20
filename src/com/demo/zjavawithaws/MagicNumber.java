package com.demo.zjavawithaws;

public class MagicNumber {

	public static void main(String[] args) {
		
		 int num=37;
		 int sum=0;
		 
		 while(num>9) {
			 sum=0;
			  while(num>0) {
				  int rem = num%10;
				  sum = sum + rem;
				  num=num/10;	//10
			  }
			  num=sum;
			  
		 }
		 if(num==1) {
			 System.out.println("magic number");
		 }
		 else {
			 System.out.println("not magic number");
		 }
		
		
		 
		
		

	}

}

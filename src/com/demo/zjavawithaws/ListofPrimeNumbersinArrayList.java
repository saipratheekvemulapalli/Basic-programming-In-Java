package com.demo.zjavawithaws;



public class ListofPrimeNumbersinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int upto  = 50;
		boolean printcomma = false;
		
		
		
		for(int i=2;i<100;i++) {
			//boolean printcomma= false;
			int flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				
				if(printcomma==true) {
					System.out.print(",");
				}
					System.out.print(i);
					printcomma=true;
					
				
			}
		}

	}

}

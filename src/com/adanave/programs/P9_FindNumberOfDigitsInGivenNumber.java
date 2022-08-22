package com.adanave.programs;

public class P9_FindNumberOfDigitsInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalDigits=0;
		int number= 19012190;
		
		while(number>0) {
			
			number= number/10;
			++totalDigits;
		}
		
		for(int i=0; ++i<10; ){ System.out.print(i); }
		System.out.println(" "); 
		
		for(int i=0; i++<10; ){ System.out.print(i); }
		System.out.println(" "); 
		int testInt=10;
		System.out.println(testInt++ ); 
		
		int testInt1=15;
		System.out.println(++testInt1 ); 
		//System.out.println(totalDigits);
		
		
	}

}

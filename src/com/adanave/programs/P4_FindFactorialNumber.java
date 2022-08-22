package com.adanave.programs;

public class P4_FindFactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is with decrement operator
		int factorial=1,number= 5;
		for(int i=number;i>0;i-- ) {
			 factorial=factorial*i; 
		}
		System.out.println(factorial);
		
		// this with increment operator
		int i,fact=1;  
		  int number1=5;//It is the number to calculate factorial    
		  for(i=1;i<=number1;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number1+" is: "+fact);    
	}
	

}

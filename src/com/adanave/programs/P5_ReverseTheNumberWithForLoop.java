package com.adanave.programs;

public class P5_ReverseTheNumberWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  
			int number = 123456, reverse = 0;  
			//we have not mentioned the initialization part of the for loop  
			for( ;number != 0; number=number/10)   
			{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			}  
			System.out.println("The reverse of the given number is: " + reverse);  
			}  
	}

}

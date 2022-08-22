package com.adanave.programs;

import java.util.Scanner;

//In fibonacci series, next number is the sum of 
//previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
//The first two numbers of fibonacci series are 0 and 1.

public class P6_FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3 variables
		int num1=0,num2=1,num3,count;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number till when u need fibanacci series ");
		count= s.nextInt();
		
		System.out.print(num1+" "+num2 );
		for (int i=2;i<count;i++) {
			
			num3=num1+num2;
			System.out.print(" "+num3);
			
			num1=num2;
			num2=num3;
			
		}
	}

}

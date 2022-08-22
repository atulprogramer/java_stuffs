package com.adanave.programs;
//add program to revers

public class P8_FindPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int remainder,sum=0,temp;
		int number=151; //number to be checked for palindrome
		
		temp=number;
		while(number>0) {
			remainder=number%10;
			sum=(sum*10)+remainder;
			number= number/10;
			
		}
		if (temp==sum) 
			System.out.println("number is palindrome");
		else 
			System.out.println("number is not palindrome");
	}

}

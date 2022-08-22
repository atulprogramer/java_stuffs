package com.adanave.programs;

import java.util.Scanner;

public class P3_FindPrimeNumbers {

	static void findPrimeNumber(int a) {
	
		int flag=0;
		int halfNumber= a/2;
		
		if (a==0 || a==1)
		{
			System.out.println(a+ " is not a prime number");
		}else {
		for (int i=2;i<=halfNumber; i++) 
		{
			if (a%i==0) {
			System.out.println(a+ " is not Prime number and is divisible by "+i );
			flag=1;
			break;
		}
		}
		if (flag==0) {
			System.out.println(a+ " is prime numebr");
		}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Please enter number which need to check Prime : ");
		int number=s.nextInt();
		findPrimeNumber(number);
		
		
		
	}

}

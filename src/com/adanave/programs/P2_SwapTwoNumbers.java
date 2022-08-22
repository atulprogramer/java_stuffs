package com.adanave.programs;

public class P2_SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber = 12;
		int secondNumber= 18;

		int a= firstNumber;
		int b= secondNumber;
		a=a+b;
		b=a-b;
		a=a-b;

		firstNumber=a;
		secondNumber=b;
		System.out.println(firstNumber+ ":"+secondNumber);
	}

}

package com.adanave.oops;

//Compile time polymorphism
//overloading occurs within same class
//return type need not to be same
//overloading take place at compile time
//may or may not require inheritance
//best practice is to change number of arguments and type of arguments
//Private,static,final methods can be overloaded

public class OverloadingExample {
	
	static int add(int a, int b) {
		return a+b;
		
	}
	static int add(int a, int b,int c) {
		return a+b+c;
		
	}
	static String add(String s1, String s2 ) {
		return s1+s2+" String concatenate";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(12,34));

		System.out.println(add("121","111"));
	}

}

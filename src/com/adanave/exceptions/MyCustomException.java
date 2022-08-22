package com.adanave.exceptions;

public class MyCustomException extends Exception {
	
	public MyCustomException() {
		// TODO Auto-generated constructor stub
		
		super();
		System.out.println("custom exception constructor");

	}
	public MyCustomException(String str) {
		// TODO Auto-generated constructor stub
		
		super(str);
		System.out.println("custom exception constructor (str)");

	}

}

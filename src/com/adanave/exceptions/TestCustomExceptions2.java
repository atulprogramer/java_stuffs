package com.adanave.exceptions;

public class TestCustomExceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new MyCustomException("basic");
			
		}catch(MyCustomException ex) {
			System.out.println("This is custom exception");
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace());

		}
	}

}

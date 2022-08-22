package com.adanave.exceptions;

public class CustomExceptionsExample  {

	//reasons for custom exceptions
	//1.To catch and provide specific treatment to a subset of existing Java exceptions.
	//2.Business logic exceptions-It is useful for the application users or the developers to understand the exact problem.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			throw new CustomException("custom exception");
		
		}catch (CustomException e)
		{
			System.out.println("Custom exception caught");
			System.out.println(e.getMessage());
		}
		
	}

}

class CustomException extends Exception{
	
	public CustomException(String s) {
		
		super(s);
	}
	
}



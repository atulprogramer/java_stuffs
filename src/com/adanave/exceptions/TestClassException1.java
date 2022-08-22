package com.adanave.exceptions;

public class TestClassException1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			validateAge(24);
			validateAge(14);

		}catch(InvalidAgeException ex) {
			System.out.println("Caught the exception");  
			    
			// printing the message from InvalidAgeException object  
			System.out.println("Exception occured: " + ex); 	
		}
	}
	
	static void validateAge(int age) throws InvalidAgeException {
	
		if (age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}

}

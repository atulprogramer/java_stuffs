package com.adanave.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowExcep {
	
static void fun() throws ArithmeticException,NullPointerException{
	
	try {
		throw new NullPointerException("exception detailed message");
	}
	catch(Exception e){
		//The flow of execution of the program stops immediately after the throw 
		//statement is executed and the nearest enclosing try block is checked to see 
		//if it has a catch statement that matches the type of exception
		System.out.println("Caught inside fun()");
		throw new NullPointerException();
		//throw new ArithmeticException();
		//System.out.println("after throw()"); -- this wont execute as this is not reachable code
		
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			fun();
			throw new SQLException();
		}
		catch(ArithmeticException e) {
			System.out.println("Caught Arithmatic Exception inside main");
		}
		catch(NullPointerException e) {
			System.out.println("Caught NPE inside main");
		}catch(SQLException e) {
			System.out.println("Caught SQLE inside main");
		}
	}

}

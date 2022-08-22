package com.adanave.javastuffs;

class Test {
	 
	 public static void main(String[] args) {
		// lambda expression to implement above
	        // functional interface. This interface
	        // by default implements abstractFun()
		LambdaExample lamb= (int x)->System.out.println(2*x);
		//Argument List +arrow token + body of lambda expression
		
		lamb.abstractFun(122);
		lamb.normalFun();
	}
}
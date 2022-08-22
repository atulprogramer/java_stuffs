package com.adanave.oops;

public class TestInterfaceOverriding implements JavaInterface {

	public int number= 1123123;

		public static void main(String[] args) {

			TestInterfaceOverriding testInterfaceOverriding = new TestInterfaceOverriding();
			System.out.println(JavaInterface.number);
			System.out.println(testInterfaceOverriding.number);
		}
		public void getInterfaceVariableValue() {
			
		}
		
		
public int addNumbers(int a, int b) {
			int sum = a+b;
			return sum;
			
		}
	

}


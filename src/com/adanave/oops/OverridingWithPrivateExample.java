package com.adanave.oops;

public class OverridingWithPrivateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ABC a = new BCD();
	      a.callDisplay();

	      BCD b = new BCD();
	      b.callDisplay();

	      ABC a1 = new ABC();
	      a1.callDisplay();
	}

}

class ABC {
	   private void display() {
	      System.out.println("A.display");
	   }
	    public void callDisplay() {
	      System.out.println("A.callDisplay");
	      display();
	   }
	}

	class BCD extends ABC {
	   private void display() {
	      System.out.println("B.display");
	   }
	    public void callDisplay() {
	      System.out.println("B.callDisplay");
	      display();
	   }  
	}

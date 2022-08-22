package com.adanave.oops;

public class MainOverloading {

	public static void main(double d) {
        System.out.println("Inside main(Double[] args) method ....");
	}
	/**
     * Standard main method, JVM will only call this method
     * even if you provided multiple overloaded version.
     * 
     */
	public static void main(String[] args) {
        System.out.println("Inside main(String[] args) method ....");
        testOverloading();
	}
	
	public static void main(int ab) {
        System.out.println("Inside main(Integer[] args) method ....");
	}
	
	public static void testOverloading() {
		main(10.9090);
		main(10);
		//return (String)121;

	}
	

}

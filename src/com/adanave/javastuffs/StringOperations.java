package com.adanave.javastuffs;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chars[] = {'a','b','c','d','e'};
		String s= new String (chars,2,1);//startfrom,numchars
		System.out.println(s);//c
		String s1= new String (chars);
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('c'));
		
		//character extraction
		//charAt()
		//getChars()
		//getBytes()
		//toCharArray()
		
		//String comparison
		//equals() and equalsIgnoreCase()
		//regionMatches()
		//startsWith() and endsWith()
		//equals versus ==
		//equals compares the chars inside string object
		//==compares two object references to see whether they refer to same instance
		String ss1= "hi";
		String ss2= new String(ss1);
		System.out.println("equals  "+ss1.equals(ss2));
		System.out.println("==" +(ss1==ss2));
		
		

	}

}

package com.adanave.programs;

public class P10_CountNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String str = " welcome to java   tutorial on Java2blog ";
	      str= str.trim();
	        int count = 1;
	 
	        for (int i = 0; i < str.length() - 1; i++)
	        {
	            if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of words in a string : " + count);
	}

}

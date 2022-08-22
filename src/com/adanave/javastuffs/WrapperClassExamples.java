package com.adanave.javastuffs;

public class WrapperClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= new String[10];
		int[] intArr= new int[10];
		String numString = "0102910";
		intArr[0]= Integer.parseInt(numString);
		arr[1]= "test1";
		arr[2]= "test2";
		arr[3]= "test3";
		
		arr[0]= "9090";
		arr[1]= "test1";
		arr[2]= "test2";
		arr[3]= "test3";
		System.out.println(intArr[0]);
		System.out.println(arr.length);
		System.out.println(arr[0].length());
		
		String str= "String testing";
		System.out.println(str.length());

	}

}

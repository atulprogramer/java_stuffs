package com.adanave.programs.strings;

import java.util.ArrayList;

public class StringProgramPractice {

	public static void main(String[] args) {
		String str ="121";
		int test1= Integer.parseInt(str);
		System.out.println(test1);
		
		int number= 102;
		String numberString= String.valueOf(number);
		System.out.println(numberString);
		System.out.println(numberString.isEmpty());
		numberString="";
		System.out.println(numberString.isEmpty());
		
		ArrayList<String> arrList= new ArrayList<>();
		arrList.add("Atul");
		arrList.add("Ramchandra");
		arrList.add("Danave");
		arrList.forEach((m) -> System.out.print(m));
		
		 String arr[]= arr[5];
		arr[0]="Atul";
		arrList.add("Ramchandra");
		arrList.add("Danave");
		arrList.forEach((n) -> System.out.print(n));
		
	}
}

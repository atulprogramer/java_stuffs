package com.adanave.programs;

import java.util.ArrayList;
import java.util.List;

//logic
//create array list for odd and even numbers
//create for loop to traverse array
//add conditions not equal to or equal to 0
//if 
public class P1_FindOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arrList= new ArrayList<>();
		arrList.add(0);
		arrList.add(1);
		arrList.add(12);
		arrList.add(16);
		arrList.add(15);
		arrList.add(22);
		arrList.add(11);
		arrList.add(112);
		
		//Declare Initialize array list for odd and even numbers
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		
		
		for(int i=0;i<arrList.size();i++) {
			if (arrList.get(i)==0) {
				System.out.println("Given Array contains "+arrList.get(i));
			}
			if (arrList.get(i)!=0) {
			if (arrList.get(i)%2==0) {
				evenNumbers.add(arrList.get(i));
			}else
			{
				oddNumbers.add(arrList.get(i));
			}
		}
		}
		//Print Odd and Even numbers 
		System.out.println("Odd numbers in the array are : "+oddNumbers);
		System.out.println("Even numbers in the array are : "+evenNumbers);
		
	}

}

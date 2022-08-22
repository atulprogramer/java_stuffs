package com.adanave.programs;
//here are 2 parts first while loop calculates number of digits and other sum of power of individual digit
public class P7_FindArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDigit= 0,sum=0,number=153,temp,totalDigits=0;
		
		//assigning number into a temp variable  
		temp= number;
		
		// this finds number of digits
		while(temp>0) {
			temp=temp/10;
			totalDigits++;
		}
		
		//this calculate the sum with power of individual 
		temp= number;
		while(temp>0) {

			//determines the last digit from the number      
			lastDigit = temp%10;// get the unit digit

			//calculates the power of a number up to digit times and add the resultant to the sum variable  
			sum+=(Math.pow(lastDigit,totalDigits));
			
			//removes the last digit   
			temp= temp/10;
		}
		//compares the sum with n  
		if (number==sum) 
			System.out.println(number+" is armstrong number");
		else System.out.println(number+" is not armstrong number");
	}

}

package com.adanave.programs;

public class P5_ReverseTheNumberWithWhileLoop1 {

	static final int number = 987654;  
	int reverse = 0;
	public void reverseNumber(int num) {
		int temp= num;
		while(temp!=0) {
			int remainder = temp%10;// get the unit digit
			reverse= reverse*10+remainder; 
			temp= temp/10;// remove unit digit
		}
		System.out.println("The reverse of the given number is: " + reverse);  
		System.out.println("original number " +number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{  
			new P5_ReverseTheNumberWithWhileLoop1().reverseNumber(number); 
			}  

}
}

package com.adanave.programs.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Input : "I love Java Programming"
Output :"Programming Java love I"
 */
public class PS2_ReverseWordsInStringEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "I.love.Java.Programming";
		System.out.println("Before Reverse");
		System.out.println(str);
		//initially reversing individual words of the given 
	        //string one by one and storing it in a list.
	        String words[] = str.split("\\.");
	        String result = "";

	        //now reversing the whole modified string by adding all 
	        //the elements of list in a single string in reverse order.
	        for (int i = words.length - 1; i >= 0; i--) {
	            result = result+ words[i];
	            if(i!=0)
	                result =result+ '.';
	        }
	        //returning the result.
	        System.out.println("after Reverse");
	        System.out.println(result);
	        
	    }
}

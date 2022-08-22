package com.adanave.programs.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 * Input : "I love Java Programming"
Output :"Programming Java love I"
 */
public class PS2_ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "I.love.Java.Programming";
		PS2_ReverseWordsInString obj = new PS2_ReverseWordsInString();
		String reverseString= obj.reverseWordsUsingCharAt(str);
		System.out.println(reverseString);
		
		//Compiles the given regular expression into a pattern.
		Pattern pattern= Pattern.compile("\\.");
		String[] temp= pattern.split(str);
		System.out.println("before reverse ");
		for(int j=0;j<temp.length;j++) {
			System.out.print(temp[j]+" ");
		}
		System.out.println("");

		String result="";
		System.out.println("After reverse");
		
		for(int i =0;i<temp.length;i++) {
			
			if (i==temp.length - 1) {
				result=temp[i]+result;
				
			}else {
				result= " "+temp[i]+result;

			}
		}
		
		System.out.println(result);
		

	}
	
	String reverseWordsUsingCharAt(String S)
	   {

	       String temp="",res="";
	       List<String> list=new ArrayList<>();
	       
	       for(int j=0;j<S.length();j++){   
	       
	    	   if(S.charAt(j)!='.'){
	              temp+=S.charAt(j);
	              if(j==S.length()-1) list.add(temp);
	           }
	           else{
	                
	               list.add(temp);
	           temp="";
	          
	           }
	       }

	      for(int i=list.size()-1;i>=0;i--){
	          res+=list.get(i) + '.';
	      }
	      return res.substring(0,res.length()-1);
	   }

}

package com.adanave.programs.strings;

import java.util.HashMap;
import java.util.Map;

//input : "geeks for geeks"
//output: s=2 e=4 g=2k=2

//1.create hashmap of type {char,int}
//2.traverse string check if the hashmap contains the traverse character or not
//3.if present then increment count or else insert the characterin the hashmap with frequency=1

public class PS4_FindDuplicatescCharCountInString {

	
	public static void main(String[] args) {
		
		 String str= "geeks for geeks";

		// TODO Auto-generated method stub
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		char[] charArray= str.toCharArray();
		
		for(char ch: charArray) {
			 // If character is present
            // in map incrementing it's
            // count by 1
			if (map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				// If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
				map.put(ch,1);
			}
		}
		 // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			
			System.out.println(entry);
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
	}

}

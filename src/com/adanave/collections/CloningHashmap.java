package com.adanave.collections;

import java.util.*;
public class CloningHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hashmap= new HashMap<String,Integer>();
		 hashmap.put("Geeks", 10);
	        hashmap.put("4", 15);
	        hashmap.put("Geeks", 20);
	        hashmap.put("Welcomes", 25);
	        hashmap.put("You", 30);
		
		System.out.println(hashmap);
		HashMap<String,Integer> clonedHashmap= new HashMap<>();
				//clonedHashmap=(HashMap<String, Integer>) ;
				System.out.println(hashmap.clone());
		clonedHashmap.putAll(hashmap);		
		System.out.println(clonedHashmap);
				
	}

}

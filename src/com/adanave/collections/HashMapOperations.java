package com.adanave.collections;

import java.util.HashMap;

public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> hashmap= new HashMap<String,Integer>();
		 hashmap.put("Geeks", 10);
	        hashmap.put("4", 15);
	        hashmap.put("Geeks", 20);
	        hashmap.put("Welcomes", 25);
	        hashmap.put("You", 30);
		
	        //System.out.println(hashmap.size());
	        
	        //inserts all items from a map to HashMap
	        HashMap<String,Integer> clonedHashmap= new HashMap<>();
			clonedHashmap.putAll(hashmap);
			
			//inserts item if the key is not already present
	        System.out.println(hashmap);

	        //add if key already not present
			hashmap.putIfAbsent("4", 17);
	        System.out.println(hashmap);

	        //updates value against existing key
			hashmap.put("4", 20);

	        System.out.println(hashmap);
	        
			

	}

}

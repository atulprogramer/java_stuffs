package com.adanave.programs;

import java.util.*;
public class SortingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String,Integer> map =new HashMap<String,Integer>();
		 // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);		
        
        //1.using putall function to copydata
        //--start
        // TreeMap to store values of HashMap
        TreeMap <String,Integer> treemap= new TreeMap<>();
       // Copy all data from hashMap into TreeMap
       treemap.putAll(map);

       //--end
       //2.using treemap constructor
       //TreeMap <String,Integer> treemap= new TreeMap<>(map);

       
       // Display the TreeMap which is naturally sorted
        System.out.println("Unsorted");
        for(Map.Entry<String, Integer>entry: map.entrySet()) {
        	System.out.println(entry.getKey()+ ":"+ entry.getValue());
        }
        
        System.out.println("Sorted");
        for(Map.Entry<String, Integer>entry: treemap.entrySet()) {
        	System.out.println(entry.getKey()+ ":"+ entry.getValue());
        }
        
	}

}

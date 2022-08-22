package com.adanave.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ADummytesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashSet <Integer> arr= new HashSet<>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	
	Iterator itr= arr.iterator();
			
	//Integer intArr[] = new Integer[arr.size()];
	//intArr= arr.toArray(intArr);
	//intArr= (Integer[]) arr.toArray();

	//Object[] array = arr.toArray();
	
	if(arr.contains(13))
		System.out.println("contains 3");
	else System.out.println("does not contain 3");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	for(Integer i:arr) {
		System.out.println(i);
	}
	
	String[] cities= {"Pune","Mumbai","Delhi","Keral"};
	
	ArrayList<String> cityArr= new ArrayList<>(Arrays.asList(cities));
	System.out.println(cityArr);
	System.out.println(cities[0]);
	
	HashMap<Integer, String> hashmap= new HashMap<>();
	hashmap.put(1, "Atul");
	hashmap.put(2, "Geeta");
	
//	for(Integer integer:hashmap.keySet()) {
//		System.out.println( "Key :"+integer+" Value : "+hashmap.get(integer));
//		
//	}
//	Set<Integer> keyset= hashmap.keySet();
//	Iterator<Integer> itrr= keyset.iterator();
//	while(itrr.hasNext()) {
//		Integer key= itrr.next();
//		System.out.println(key+", value: "+hashmap.get(key));
//	}
//	
//	
	Set <Map.Entry<Integer,String>> entryset=hashmap.entrySet();
	for(Map.Entry <Integer,String> entry: entryset) {
		System.out.println(entry.getKey() +"  "+entry.getValue());
		
	}
	
	}

}

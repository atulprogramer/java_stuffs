package com.adanave.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashmapSortingWithTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> hashmap = new HashMap<>();
		
		// Adding Key and Value pairs to HashMap
	    hashmap.put(22,"A");
	    hashmap.put(55,"B");
	    hashmap.put(33,"Z");
	    hashmap.put(44,"M");
	    hashmap.put(99,"I");
	    hashmap.put(88,"X");
		
	    Set set= hashmap.entrySet();
	    Iterator itr= set.iterator();
	    
	    System.out.println("Before sorting" );
	    while (itr.hasNext()) {
	    //System.out.println(itr.next());
	    	Map.Entry pair= (Map.Entry) itr.next();
	    	System.out.println(pair.getKey()+ ":" + pair.getValue());
	    }
	    Map<Integer,String> map= new TreeMap<Integer,String>(hashmap);
	    Set set2= map.entrySet();
	    Iterator itr2= set2.iterator();
	    System.out.println("After sorting" );
	    while (itr2.hasNext()) {
	    	//System.out.println(itr2.next());
	    	Map.Entry pair= (Map.Entry) itr2.next();
	    	System.out.println(pair.getKey()+ ":" + pair.getValue());
	
	    }
	    
	    
	    
	    
	    
	    
	}

}

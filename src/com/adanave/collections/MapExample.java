package com.adanave.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
	Map <String,Integer> map = new LinkedHashMap<>();
	map.put("guitar",1200);
	map.put("cello",3000);
	map.put("drum",2000);
	
	//map.forEach(System.out :: println);
	
	System.out.println("before size"+map.size());
	
	map.put("cello",3500);
	System.out.println("After size"+map.size());
	System.out.println(map.get("cello"));

	}
}

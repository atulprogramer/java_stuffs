package com.adanave.javastuffs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer,String> map= new HashMap<Integer,String>();
		map.put(1,"Atul");
		map.put(2,"ztul");
		map.put(2,"Geeta");
		map.put(2,"Geeta1");
		
		Set <Map.Entry<Integer,String>> set= map.entrySet();
		Iterator<Map.Entry<Integer,String>> itr= set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e= itr.next();
			
			System.out.println(e.getKey()+"  "+e.getValue());
			
		}
	}

}

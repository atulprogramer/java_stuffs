package com.adanave.collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs= new HashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(11);
		hs.add(15);
		hs.add(11);

		HashSet<String> hs2= new HashSet<>();
		hs2.add("My");
		hs2.add("Name");
		hs2.add("Is");
		hs2.add("Atul");
		hs2.add("Danave");
		Vector<Integer> vect= new Vector<>();
		
		
		Iterator<Integer> it= hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
		
		Iterator<String> it2= hs2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next()+ " ");
		}
		
	}

}

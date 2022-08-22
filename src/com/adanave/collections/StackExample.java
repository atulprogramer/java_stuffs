package com.adanave.collections;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no such element exception
		//ArrayDeque<String> ad = new ArrayDeque<>();
		//ad.pop();
		
		Stack <String> st = new Stack<String>();
		st.push("one");
		st.push("two");
		st.push("three");
		st.push(null);

		System.out.println(" from element " +st.peek());

		System.out.println(" peek element " +st.peek());
		
		Iterator<String> itr= st.iterator();
		System.out.println(" After Push ");

		//printing stack
		while (itr.hasNext()) {
		System.out.println(itr.next()+ " ");
		}
		
		st.pop();
		itr= st.iterator();

		System.out.println(" After pop ");
		
		//printing stack
		while(itr.hasNext()) {
			System.out.println(itr.next()+" " );
		}
		
	}

}

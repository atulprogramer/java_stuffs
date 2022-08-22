package com.adanave.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq= new PriorityQueue<>();
		pq.add("ABC");
		// Printing the top element and removing it
        // from the PriorityQueue container
		System.out.println(pq.poll());
		System.out.println(pq.poll());
  
	}

}

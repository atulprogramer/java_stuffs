package com.adanave.collections;

import java.util.*;

public class ListInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Creating an object of List interface
        // implemented by the ArrayList class
       List<Integer> l1 = new ArrayList<Integer>();
 
       // Adding elements to object of List interface
       // Custom inputs
 
       l1.add(0, 1);
       l1.add(1, 2);
 
       // Print the elements inside the object
       System.out.println(l1);
 
       // Now creating another object of the List 
       // interface implemented ArrayList class
       // Declaring object of integer type
       List<Integer> l2 = new ArrayList<Integer>();
 
       // Again adding elements to object of List interface
       // Custom inputs
       l2.add(1);
       l2.add(2);
       l2.add(3);
 
       // Will add list l2 from 1 index
       l1.addAll(1, l2);
 
       System.out.println(l1);
 
       // Removes element from index 1
       l1.remove(1);
 
       // Printing the updated List 1
       System.out.println(l1);
 
       // Prints element at index 3 in list 1
       // using get() method
       System.out.println(l1.get(3));
 
       // Replace 0th element with 5
       // in List 1
       l1.set(0, 5);
 
       // Again printing the updated List 1
       System.out.println(l1);
       
       List <String> theList= new ArrayList<>();
       theList.add("atul");
       theList.add("geeta");
       theList.add("ram");
       theList.add("sarika");
       
       //using for loop
	   System.out.println("Using for loop");
       for(int i=0;i<theList.size();i++) {
    	   System.out.println(theList.get(i));
       }
       
       //using while+iterator
	   System.out.println("Using while and iterator");

       Iterator it= theList.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
      }
       
       //for loop
	   System.out.println("Using for object loop");

       for(Object obj : theList) {
    	   System.out.println(obj);
       }
       
       //using for each
	   System.out.println("Using foreach loop");

       theList.forEach(System.out::println);
	}

}

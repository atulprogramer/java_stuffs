package com.adanave.javastuffs;

import java.util.ArrayList;
import java.util.List;

//advantages of Generics
//Type-safety
//type casting is not required
//compile time checking


public class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List list = new ArrayList();
	list.add(1);
	list.add("Atul");
	System.out.println(list);
	
	List<Integer> list1 = new ArrayList<Integer>();

	list1.add(1);
	//list1.add("Atul");
	System.out.println(list);

	//type casting is not required
	List list2 = new ArrayList();    
	list2.add("hello");   
	String s1= (String) list2.get(0);
	//String s = (String) list.get(0);//typecasting    
	//After Generics, we don't need to typecast the object.  
	List<String> list3 = new ArrayList<String>();    
	list3.add("hello");    
	String s = list3.get(0);
	JavaGenerics obj =new JavaGenerics();
	   Class currentcls = obj.getClass();
	   Class supercls = obj.getClass().getSuperclass();
	      System.out.println("Current class : "+currentcls.getName());
	      System.out.println("Super class : "+supercls.getName());
	
	}

}

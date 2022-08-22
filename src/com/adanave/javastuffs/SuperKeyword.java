package com.adanave.javastuffs;

class ParentClass1{
	
	public ParentClass1(){
		System.out.println("This is parent class constructor");
	}
}
class ChildClass extends ParentClass1{
	public ChildClass() {
		// compiler will auto put super() statement if we are not using 
		super();
		System.out.println("This is child class constructor");
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass child= new ChildClass();
		System.out.println("Inside main");
	}

}

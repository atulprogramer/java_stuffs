package com.adanave.oops;

//runtime polymorphism
//it is performed in two classes with inheritance relationships
//always need inheritance
//methods shud have same name and signature
//dynamic binding used- which causes poor performance

public class OverridingExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Animal an= new Animal();
		an.bark();
		Animal an1= new Dog();
		an1.bark();
		Dog dg1= new Dog();
		dg1.bark();
		
		Birds bird = new Dog();
		bird.fly();*/
		
		JavaInterface javaInterface= new TestInterfaceOverriding();
		System.out.println(javaInterface.addNumbers(121,121));
		//JavaInterface javaInterface1= new JavaInterface();
		//System.out.println(javaInterface.addNumbers(121,121));
		JavaInterface.number;
		
		
		
	}

}
class Animal{
	
	  void bark() {
		
		 System.out.println("this is animal class");
	}
}

interface Birds{
	
	 void fly();
	
}
class Dog extends Animal implements Birds{
	
	@Override
	   void bark() {
		System.out.println("this is dog class");
	   }
	
	public void fly(){
		System.out.println("dogs dont fly");
		}
	}

		
	
	


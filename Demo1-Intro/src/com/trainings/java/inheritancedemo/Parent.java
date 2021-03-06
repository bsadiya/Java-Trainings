package com.trainings.java.inheritancedemo;


class  TestInheritance{
public static void main(String[] args) {
		
//		Parent p =new Parent();
//		p.parentMethod();
//		System.out.println(p.i);

//		Parent p1 = new Child();
//		p1.parentMethod();
//		p1.childMethod();
		
		Child c = new Child();
		c.parentMethod();
		c.childMethod();
		
//		Child c1 = new Parent(); // not valid
		
	}
}


public class Parent {

	final int i = 10;
	
	static {
		System.out.println("parent class static block");
	}
	
	{
		System.out.println("parent class ins block");
	}
	
	Parent() {
		
		System.out.println("parent class 0-arg cons");
	}
	
	void parentMethod() {
		System.out.println("parent class parentMethod");
	}
};

class Child extends Parent {
	
	int i =20;
	
	static {
		System.out.println("Child class static block");
	}
	
	{
		System.out.println("Child class ins block");
	}
	
	Child() { 
		 super(); // generated by compiler
		System.out.println("child class 0-arg cons");
	}
	
	@Override
	void parentMethod() {
		super.parentMethod();
		System.out.println(" Child class overrides parentMethod");
	}
	
	void childMethod() {
//		super.i = 30; // The final field Parent.i cannot be assigned
		System.out.println("i: "+i);
		System.out.println(" Child class overrides childMethod ");
	}

	
};




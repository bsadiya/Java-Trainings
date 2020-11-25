package com.trainings.java.polymorphism;

public class CompileTimePolymorphism {
	
	void draw() {
		System.out.println("Parent Draw Method");
	}
	
	
	void draw(String name) {
		System.out.println("Child Draw Method with arg "+ name);
	}

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw(); // parent method
		c.draw("Eclipse"); // child method -- Compiler decides
		
	}

}


class Shape{
	
	// Overriden Method
	void draw() {
		System.out.println("Parent Draw Method");
	}
}

class Circle extends Shape{
	
//	Overriding Method
	void draw() {
		System.out.println("child Draw Method");
	}
	
//	Overloading Method
	void draw(String name) {
		System.out.println("Child Draw Method with arg "+ name);
	}
}
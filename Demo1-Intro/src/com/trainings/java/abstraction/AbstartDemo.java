package com.trainings.java.abstraction;

public class AbstartDemo {

	public static void main(String[] args) {

		Shape s = new Circle();// In a real scenario, object is provided through method, e.g., getShape()
		// method
		s.draw();
		s.nonAbstarctMethod();
//		s.circleMethod(); // cannot accessible
		
		Circle c = new Circle();
		c.draw();
		c.nonAbstarctMethod();
		c.circleMethod();

	}

}

abstract class Shape {
	abstract void draw();

	void nonAbstarctMethod() {
		System.out.println("Non-Abstract Method");
	}
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
	
	void circleMethod() {
		System.out.println("Circle class Method");
	}
}


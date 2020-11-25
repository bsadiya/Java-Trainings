package com.trainings.java.polymorphism;

public class PolymorphismDemo {
	
	public void methodOne() {
		System.out.println("no-arg method");
	}

	public void methodOne(int i) {
		System.out.println("int-arg method"); // overloaded methods
	}
	

	public void methodOne(int i, int j) {
		System.out.println(" two int-arg method"); // overloaded methods
	}

	public void methodOne(double d) {
		System.out.println("double-arg method");
	}

	
	void sum(int a, int b) {
		System.out.println("Sum:"+(a+b));
	}
	
	public static void main(String[] args) {
		PolymorphismDemo t = new PolymorphismDemo();
		t.methodOne();// no-arg method
		t.methodOne(10);// int-arg method
		t.methodOne(10.5);// double-arg method
//		compile time Polymorphism
		
		byte b1 =1; 
		byte b2= 2;
//		byte-short-int-long
//		Automatic promotion in overloading.
		t.sum(b1, b2);
		
		long l1 =1L;
		long l2 = 2L;
//		t.sum(l1, l2); // The method sum(int, int) in the type Test is not applicable for the arguments (long, long)
	}
}

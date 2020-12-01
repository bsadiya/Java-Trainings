package com.trainings.java.exceptionhandling;

public class StackOverflowDemo {

	public static void main(String[] args) {
		StackOverflowDemo obj = new StackOverflowDemo();
		System.out.println("m1 method");
		obj.m1();

	}

	void m1() {
		System.out.println("m1 method Start");
		m2();
		System.out.println("m1 method end");
	}

	void m2() {
		System.out.println("m2 method Start");
		m1();
		System.out.println("m2 method end");
	}


}

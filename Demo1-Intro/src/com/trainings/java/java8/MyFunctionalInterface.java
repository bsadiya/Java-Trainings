package com.trainings.java.java8;

//@FunctionalInterface
public interface MyFunctionalInterface {

	int method1(int a, int b); // Declaring ex: int a; 
//	int method2(int a, int b);
	
}

// Comparable -->compareTo() -->FI


@FunctionalInterface
interface MyFunctionalInterface1{
	void wishMe();
}

interface MyPredicate<T>{
	
	boolean myTest(T t);
}
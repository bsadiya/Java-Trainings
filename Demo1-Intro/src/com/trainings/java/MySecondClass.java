package com.trainings.java;

/**
 * @author sadbegum
 *
 */
//class- syntax: <modifier> class-Keyword class-name 
public class MySecondClass {
	
//	variables
//	type variableName = value; // instance variable
	
	static int MaxValue; //invalid standard
	int max;
//	int 10Max; // invalid
	
	//Constants
	final double MY_PI_VALUE = 3.14;
	
	
//	_ $ in names...
	
	
	
	
	int minValue = 10;
	double interest = 2.5;
	
	FirstClass first;
	
	String name = "";
	
//	methods
//	<Modifier> returnType method-name
	public static void main(String[] args) {
//		Creating Objects
		
		wishMe();
		
		int myResult = add(100,200);
		System.out.println(myResult);
		
	}
	
	static int add(int a, int b) {
		
		int result = a+b;
		
		return result;
		
	}
	
	static void wishMe() {
		System.out.println("Helloo!! " +MaxValue);
	}


}

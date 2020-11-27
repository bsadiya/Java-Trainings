package com.trainings.java.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i = 010;
		System.out.println(i);
		System.out.println("Arthmt operation Start!!!!!");
		Test.arithMeticOperation();
		System.out.println("Arthmt operation performed!!!!!");

	}
//	stack --> main()
//	stack --> main()->arithMeticOperation() 
//	stack --> main()->arithMeticOperation() ->divide()
//	stack --> main()->arithMeticOperation() ->divide() -> divideZero()
	
//	stack --> main()->arithMeticOperation() ->divide() -> divideZero()

}

class Test {
	public static void arithMeticOperation() {
		divide();
	}

	public static void divide() {
		divideZero();
	}

	public static void divideZero() {
		
		System.out.println("Dividing with Zero Satrt!!!!");
		
		System.out.println(10 / 0);
		
		System.out.println("Divided by Zero Succesfully.....");
	}
}
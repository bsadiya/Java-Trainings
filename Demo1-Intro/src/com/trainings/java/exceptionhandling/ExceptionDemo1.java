package com.trainings.java.exceptionhandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Arthmt operation Start!!!!!");
		Test2.arithMeticOperation();
		System.out.println("Arthmt operation performed!!!!!");

	}

}

class Test2 {
	public static void arithMeticOperation() {
		divide();
	}

	public static void divide() {
		try {
			divideZero();
			System.out.println("stmt 6");
		} catch (NullPointerException e) {
			System.out.println("Exception Block!! Diving by Zero operation performed!!!");
			System.out.println("ArithmeticException occured with stack trace: getMessage:  " + e.getMessage());
			System.out.println("ArithmeticException occured with stack trace: toString: " + e.toString());
//			e.printStackTrace();
		}
		
		System.out.println("stmt 7");

	}

	public static void divideZero() {

		System.out.println("Dividing with Zero Satrt!!!!");

		System.out.println("Stmt3");
		System.out.println("UnChecked Exception!!!");
		System.out.println(10 / 0);
		System.out.println("Stmt4");

		System.out.println("Divided by Zero Succesfully.....");
	}
}
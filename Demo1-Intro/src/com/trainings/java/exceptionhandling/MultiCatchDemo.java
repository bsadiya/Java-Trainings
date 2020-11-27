package com.trainings.java.exceptionhandling;

public class MultiCatchDemo {

	public static void main(String[] args) {

		System.out.println("stmt1");
		System.out.println("stmt2");

		String s = null;
//		String s = "Sadiya";
		try {
			
			System.out.println(1 / 0);
			System.out.println(s.length()); // NullpointerException
			
			
		} catch (NullPointerException ne) {
			System.out.println("NullPointer Exception Occured!!!!...");
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException Occured!!!!...");
		}

		System.out.println("stmt3");
		System.out.println("stmt4");

	}

}

package com.trainings.java.exceptionhandling;

public class NestedTryDemo {

	public static void main(String[] args) {

		System.out.println("stmt1");
		System.out.println("stmt2");

		String s = "Sadiya";
		try {
			System.out.println(s.length()); // NullpointerException
			
			method1();
			
			
		}
//		Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
//		catch (NullPointerException ne) {
//			System.out.println("NullPointer Exception Occured!!!!...");
//		} 

		// V  1.7 -- MultiCatch
		catch(RuntimeException | Error e) {
			System.out.println("");
		}
		catch (Exception e ) {
			System.out.println("Exception Occured...."+e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("stmt3");
		System.out.println("stmt4");

	}

	private static void method1() {
		try {
		System.out.println(1 / 0);
		}
		catch (ArithmeticException ae) {
			System.out.println("stmt5");
			System.out.println("ArithmeticException Occured!!!!...");
		}
		
		System.out.println("stmt6");
	}

}

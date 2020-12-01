package com.trainings.java.exceptionhandling;

public class ExceptionDemo2 {

	public final int finalVariable=100;
	public static void main(String[] args) {
		System.out.println("Arthmt operation Start!!!!!");
		Test1.arithMeticOperation();
		
		Test1 t = new Test1();
		System.out.println("Arthmt operation performed!!!!!");

	}

}

class Test1 {
	public static void arithMeticOperation() {
		try {
			divide();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void divide() throws Exception {
		divideZero();
	}

	public static void divideZero() {
		
		System.out.println("Dividing with Zero Satrt!!!!");
		try {
			System.out.println("Stmt1");
			System.out.println("Checked Exception!!!");
			System.out.println("Stmt2");
		}
		catch(Exception e){
			System.out.println("Exception Block!!");
				throw new ArithmeticException("ExceptionOccured!!"); // un-checked
//				throw new ExceptionDemo2(); // an exception type must be a subclass of Throwable
		}
		finally {
			// close open  streams --- file closure or DB connection closure
			System.out.println("Finallly Block!!");
		}
	
		
		try {
		System.out.println("Stmt3");
		System.out.println("UnChecked Exception!!!");
		System.out.println(10 / 0);
		System.out.println("Stmt4");
		}
		catch(ArithmeticException e){
			System.out.println("Exception Block!! Diving by Zero operation performed!!!");
			System.out.println("ArithmeticException occured with stack trace: getMessage:  "+e.getMessage());
			System.out.println("ArithmeticException occured with stack trace: toString: "+e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("Stmt5");
		}
		
		System.out.println("Divided by Zero Succesfully.....");
	}
}
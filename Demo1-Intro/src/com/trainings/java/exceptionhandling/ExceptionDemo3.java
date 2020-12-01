package com.trainings.java.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) throws FileNotFoundException{

		
		try {
			System.out.println("Try Block");
			IOException myExp = new IOException("My Exception");
			throw myExp;
			
			
			
		}
		catch(IOException e) {
			System.out.println(" IOException Occured!!!");
		}
		catch(ArithmeticException e) {
			System.out.println("Error Occured!!!");
		}
		finally {
			System.out.println("Final Block");
		}
		

		
		try {
			FileNotFoundException myExp = new FileNotFoundException("My Exception");
			throw myExp;
		}finally {
			
		}
	}

}

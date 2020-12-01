package com.trainings.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException   {
		FileReader file = null;
		try(BufferedReader fileInput = new BufferedReader(file)) {
			file = new FileReader("C:/Desktop/AATestFile"); // FileNotFoundException

//			fileInput = new BufferedReader(file);
			
			for(int i=0; i <3; i++) {
					System.out.println(fileInput.readLine());
			}
			
		}
		catch(FileNotFoundException e) {
			 file = new FileReader("C:/Desktop/ATestFile");
		}
		

	}

	
	//ClassNotFound, SQLException
}

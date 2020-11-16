package com.trainings.java.demo.string;

import java.util.Scanner;

public class StringReverseDemo {
	

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Raju");
		test1(sb);
		System.out.println(sb);
		String s= "SAdiya";
		test2(s);
		System.out.println(s);
		
		 String r =  test(s);
		  System.out.println(s);
		  System.out.println(r);
		  
		  
		String original, reverse = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	    
	    
	    StringBuffer a = new StringBuffer("Java programming is fun");
	     System.out.println(a.reverse());

	   
	}
	
	static String test(String str) {
		System.out.println(str);
		str += "Raju";
		return str;
	}
	
	static void test1(StringBuilder str) {
		str=str.append("Raju");
	}
	
	static void test2(String str) {
		str+="Raj";
	}

}

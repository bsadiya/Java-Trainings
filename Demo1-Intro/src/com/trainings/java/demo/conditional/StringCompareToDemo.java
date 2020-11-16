package com.trainings.java.demo.conditional;

public class StringCompareToDemo {

	public static void main(String[] args) {
		String str1="Raju";
		
		System.out.println(str1.length());
		
		String str2="Sadiya";
		String str3="Raju";
		
//		> --->+ve;  < = -ve ;  =0
		
		System.out.println(str1.compareTo(str2));//-1
		System.out.println(str1.compareTo(str3));//0
		System.out.println(str2.compareTo(str1));//1
		System.out.println("raju".compareTo("RAJU"));//32
		System.out.println("raju".compareToIgnoreCase("RAJU"));//0
		
		if(str1.compareTo(str2) < 0) {
			System.out.println("first string first character Unicode value is smaller than second string first\r\n" + 
					"character Unicode value");
		}

	}

}

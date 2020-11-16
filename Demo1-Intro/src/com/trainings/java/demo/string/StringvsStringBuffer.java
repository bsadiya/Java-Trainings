package com.trainings.java.demo.conditional;

public class StringvsStringBuffer {

	public static void main(String[] args) {
		
		String str1="Raju";
		String str2 = str1.concat(" Sadiya");//concat() method return String object.
		System.out.println(str1);
		System.out.println(str2);
		
		//immutability class (modifications on existing content not allowed)
		String str="Sadiya";
		str.concat("Begum");
		System.out.println(str);
		//mutability class (modifications on existing content possible)
		StringBuffer sb = new StringBuffer("Raju");
		sb.append(" Mohan");
		System.out.println(sb);
		
		
		
	}

}

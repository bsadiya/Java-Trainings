package com.trainings.java.demo.conditional;

public class StringDemo {

	public static void main(String[] args) {
		//String is used to represent group of characters or character array enclosed with in the double quotes.
		
		String str = "Raju"; // Literals
		System.out.println(str);
		
		String str1 = new String("Raju");
		String s = new String();
		s = "SAdiya";
		System.out.println(str1);
		
		char[] ch = { 'R', 'A', 'J', 'U' };
		String str3 = new String(ch);
		
		System.out.println(str3);
		char[] ch1 = { 'a', 'R', 'a', 'j', 'u',  'a' };
		String str4 = new String(ch1, 1, 5);
		System.out.println(str4);
		
		byte[] b = { 65, 66, 67, 68, 69, 70 };
		String str5 = new String(b);
		System.out.println(str5);
		byte[] b1 = { 65, 66, 67, 68, 69, 70 };
		String str6 = new String(b1, 2, 4);
		System.out.println(str6);
		
		

	}

}

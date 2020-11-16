package com.trainings.java.demo.conditional;

public class StringMiscMethodsDemo {

	public static void main(String[] args) {
		// cahrAt() method
		String str = "Raju";
		System.out.println(str.charAt(1)); // a
		
		// System.out.println(str.charAt(10));StringIndexOutOfBoundsException
		char ch = "Raju".charAt(2);
		System.out.println(ch);
		// split() method
		String s = "hi Raju how r u";
		String[] str1 = s.split(" ");
		for (String str2 : str1) {
			System.out.println(str2);
		}
		// trim()
		String ss = " Raju ";
		System.out.println(ss.length());// 6
		System.out.println(ss.trim());// Raju
		System.out.println(ss.trim().length());// 4

		String str11 = "Raju how r u";
		str11.replace('a', 'A');
		System.out.println("********"+str11); 
		System.out.println(str11.replace("how", "who")); 
		
		String str22 = "Sadiya software solutions";
		System.out.println(str22);
		System.out.println(str22.replace("software", "hardware"));
		String str3 = "Raju HOW R U";
		System.out.println(str3.toUpperCase());// RAJU HOW R U
		System.out.println(str3.toLowerCase());
		System.out.println("RAJU".toLowerCase());
		System.out.println("soft".toUpperCase());
		
		
		String str4="Raju how r u";
		System.out.println("--------------"+str4.endsWith("s u")); //true
		
		System.out.println(str4.endsWith("how")); //false
		System.out.println(str4.startsWith("d")); //false
		System.out.println(str4.startsWith("R")); //true
		String sss="Sadiya how r u";
		System.out.println(sss.substring(2)); // diya how r u
		System.out.println(sss.substring(1,7)); 
		System.out.println("SadiyaBegum".substring(2,5)); 

	}

}

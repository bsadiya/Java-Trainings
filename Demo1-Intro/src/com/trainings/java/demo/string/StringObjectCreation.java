package com.trainings.java.demo.string;

public class StringObjectCreation {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = t1;
		System.out.println(t1 == t2); // false
		System.out.println(t1 == t3); // true
		String str1 = "Raju";
		String str2 = "Raju";
		System.out.println(str1 == str2); // true
		String s1 = new String("anu");
		String s2 = new String("anu");
		System.out.println(s1 == s2); // false
		StringBuffer sb1 = new StringBuffer("Sadiya");
		StringBuffer sb2 = new StringBuffer("Sadiya");
		System.out.println(sb1 == sb2); // flase
		
		String s = str1.concat(str2);
		sb1.append(sb2);
		System.out.println(sb1);
		
		
	}

}


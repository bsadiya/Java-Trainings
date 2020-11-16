package com.trainings.java.demo.conditional;

public class StringEqualsDemo {

	public static void main(String[] args) {
		Test t1 = new Test("Raju");
		Test t2 = new Test("Raju");
		Test t3 = t1;
//		System.err.println(t1);
		// Object class equals() method executed (reference comparison)
		System.out.println(t1.equals(t2));
		
		
		
		String str1 = new String("Sadiya");
		String str2 = new String("Sadiya");
		System.out.println(str1.toString());
		// String class equals() method executed (content comparison)
		System.out.println(str1.equals(str2)); // True
		
		StringBuffer sb1 = new StringBuffer("Sai");
		StringBuffer sb2 = new StringBuffer("Sai");
		
		sb1.append("Shyam");
		System.out.println(sb1);
		
		
		
		System.out.println(sb1.toString());
		// StringBuffer class equals() executed (reference comparison)
		System.out.println("String Buffer Equlas: "+ sb1.equals(sb2));

		
		//Compare
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		System.out.println("------");
		System.out.println(str1==str2); 
		System.out.println(str1.equals(str2));
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
		String str11 = "hello";
		String str22 = "hello";
		String str33= new String("hello");
		System.out.println(str11==str22); //true
		System.out.println(str11==str33); //false
		System.out.println(str11==str33); //false
		System.out.println(str11.equals(str22)); //true
		System.out.println(str11.equals(str33)); //true
		System.out.println(str22.equals(str33)); //true
	}

}

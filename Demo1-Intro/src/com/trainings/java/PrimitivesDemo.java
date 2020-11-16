package com.trainings.java;

public class PrimitivesDemo {
	
	// Bitwise & | -- only for boolean
	// Logical/ short circuit && ||
	
	void andOperator(int a , int b, int c){
		a=10;
		b=20;
		c=30;
		if((a > b) && (a > c)) {
			
		}
	}
	
	
	
	
//	int, long, float, double, char, boolean and  <String, enums>
	// 123344, 1.2, 'c', true/false
	static byte b=126; // 1 byte=8bits:  range -126 to +127
	
	static short s=128; // 2 byte= 16 bits
	
	static char c ='A'; 
	
	static int i;
	
	static long l;
	
	static float f;
	
	static double d;
	
	static boolean bool;
	
	public static void myprimitives(){
	System.out.println("Byte: "+b);
	System.out.println("Short: "+s);
	System.out.println("char: "+c);
	System.out.println("int: "+i);
	System.out.println("long: "+l);
	System.out.println("float: "+f);
	System.out.println("double: "+d);
	System.out.println("boolean: "+bool);
	
}
	
	public static void main(String[] args) {
		
		
		String s1= "Hello ";
		String s2 = "World!!";
	
		int ii =10;
		int jj=20;
		
		String s3 = ii + jj + s1 + s2 + ii + jj;
		
		
		System.out.println('A'+'B');
		
		System.out.println(s3);
		
		
//		result type = max(int, typeof a, typeof b)
		
		int b=20;
		b++; // valid
		b=b+1;
		System.out.println(b);
		

		
		
		
		
		
		
//		Unary Operators: ++, --: pre incre, post incr
		int x = 10; //10
//		int y = x++; // x=x+1
//		int z = ++x;
		
		x++;
		++x;
		
		System.out.println("X: "+x); //12
//		System.out.println("Y: "+y); //10
//		System.out.println("Z: "+z);// 12
		
//		Implicit/Explicit
		
	
		
		b = 10+20;
		System.out.println(b);
		
		char ch = 'a';
		int chr = ch; // lower dt to highr dt -- implicit type cast...
		System.out.println(chr);
		
		int i =130;
		byte by = (byte) i; // large dt to lower dt-- explicit tp
		
		System.out.println(by);

		
		
		myprimitives();
	}
}

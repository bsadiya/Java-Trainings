package com.trainings.java.demo.arrays;

import java.util.Arrays;

/**
 * Arrays are used to represent group of elements as a single entity but these elements are
 * homogeneous & fixed size
 * 
 * Whenever we are creating an array every element is initialized with default value automatically.
 * Initial value of array element is its default value - for ex: int[] - 0; object[] - null ; char - ' '
 * 
 * @author sadiya
 *
 */
public class ArraysDemo {

	public static void main(String[] args) {
		
//		Declaration, Construction, Initialization
		int[] a1;
		int a2[];
		int []a3;
		int[] a4, b4;
		
		// declares an array of integers
		int[] anArray;
		// allocates memory for 10 integers
		anArray = new int[10]; //---> 0,1,2,3,...9
		// initialize first element
		anArray[0] = 10;
		anArray[0] = 10000;
		// initialize second element
		anArray[1] = 20;
		// and so forth
		anArray[2] = 30; anArray[3] = 40; anArray[4] = 50; anArray[5] = 60;
		anArray[6] = 70; anArray[7] = 80; anArray[8] = 90; anArray[9] = 100; //anArray[10] = 100; 
		
//		perform declaration, construction and initialization of an array in a single line
		int[] inta = {1, 2, 3, 4};
		int[] a=new int[]{10,20,30,40}; // valid
//		int[] aaaaaa=new int[4]{10,20,30,40}; // invalid
		char[] ch={'a','e','i','o','u'};//valid
		
		//Primitive Arrays and Object arrays
		String[] s={"Sadiya","Raju","Sai","Shyam"};//valid
				
			

		int[] aa=new int[3];
//		int[] arr=new int[];//Error:array dimension missing
		int[] aaa=new int[0]; // valid
//		int[] negArr=new int[-3];// Runtime Exception- NegativeArraySizeException
		int[] ina=new int['a'];//(valid)
		System.out.println("array with Character length: "+ina.length);
		byte b=10;
		int[] bytea=new int[b];//(valid)
		short ss=20;
		int[] shorta=new int[ss];//(valid)
		
		
		char[] charray = new char[2];
		System.out.println(Arrays.toString(charray));
		
//		Printing Arrays/ Accessing Array Elements
		
		// For-Loop
		System.out.println("Printing Array Elements using For-Loop");
		for(int i=0; i<anArray.length; i++) {
			System.out.println(anArray[i]);
		}
		
		// For-Each-loop
		System.out.println("Printing Array Elements using For-Each-Loop");
		for(int i : anArray) {
			System.out.println(i);
		}
		
		// With Methods:
		System.out.println("Demonstarting Arrays as params and rerutn type");
		m2();
		int[] intArray = m2();
		m1(intArray);
		
	}

	static void m1(int[] a) // method parameter is array
	{
		for (int a1 : a) {
			System.out.println(a1);
		}
	}

	static int[] m2() // method return type is array
	{
		return new int[] { 100, 200, 300 };
	}


}

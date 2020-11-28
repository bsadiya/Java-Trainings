package com.trainings.java.demo.arrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][] = new int[2][2];

		int b[][] = { { 1, 2, 3 }, { 1, 2, 3, 4 } };

		b[0] = new int[] { 1, 1, 1, 1, 1 }; // overrides {1,2,3}

		a[0] = new int[] { 1, 2, 3, 4, 5 };
		a[1] = new int[] { 1, 2, 2, 3, 4, 5 };
//		a[2]= new int[] {1,2,2,3,4,5}; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

		System.out.println("-------a Array:------");
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));

		System.out.println("-------b Array:------");
		System.out.println(Arrays.toString(b));
		System.out.println(b.length);
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

	}

}

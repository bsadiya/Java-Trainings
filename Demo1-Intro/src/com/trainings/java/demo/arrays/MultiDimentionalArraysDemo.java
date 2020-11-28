package com.trainings.java.demo.arrays;

public class MultiDimentionalArraysDemo {

	public static void main(String[] args) {
		int[][] a1; // 2-D array
		int [][]a2;
		int a3[][];
		int []a4[];
		int[] a5[],b5;
		int[] a6[],b6[];
		
		
//		int[] a7,[]b7; // Error- If we want to specify the dimension before the variable that rule is applicable only for
						//the 1st variable. Second variable onwards we can't apply in the same declaration.
		

		
		int[][] a={{10,20,30},{40,50,60}};
		System.out.println(a[0]);
		for(int i : a[0]) {
			System.out.println("***** "+i);
		}
		
		System.out.println(a[0][0]);//10
		System.out.println(a[1][0]);//40
		System.out.println(a[1][1]);//50
		
		String[][] str={{"A.","B.","C."},{"Raju","Sadiya","Shyam"}};
		System.out.println(str[0][0]+str[1][0]);
		System.out.println(str[0][1]+str[1][1]);
		System.out.println(str[0][2]+str[1][2]);

	}

}

package com.trainings.java.demo.arrays;

public class ThreeDArray {

	public static void main(String[] args) {

		int a[][][] = new int[][][] { { {1,2,3} ,{1,2,3},{1,2,3}},{ {4,5,6} ,{4,5,6},{4,5,6}},{ {7,8,9} ,{7,8,9},{7,8,9}} };

//		a[0] = new int[][] { {} };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; j < 3; j++) {
//					System.out.print(" " + a[i][j][k]);
					System.out.print(" " + a[i][i][i]);
				}
			}
			System.out.println();
		}

	}

}

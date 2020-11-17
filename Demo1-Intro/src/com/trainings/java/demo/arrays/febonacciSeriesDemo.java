package com.trainings.java.demo.arrays;

import java.util.Scanner;

public class febonacciSeriesDemo {

	public static void main(String[] args) {
		System.out.println("enter start series of febonacci >= 2");
		int x = new Scanner(System.in).nextInt();
		int[] feb = new int[x];
		feb[0]=0;
		feb[1]=1;
		for (int i=2;i<x;i++)
		{
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		//print the data
		for (int feb1 : feb)
		{
			System.out.print(" " + feb1);
		}

	}

}

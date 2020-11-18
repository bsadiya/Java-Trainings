package com.trainings.java.demo.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortingDemo {

	public static void main(String[] args) {
		
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		System.out.println("UnSorted Array: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
		Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};
		System.out.println("UnSorted Integer Array: "+ Arrays.toString(arr1));
		// Sorts arr[] in descending order 
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("descending order Integer Array: "+ Arrays.toString(arr1));

	}

}

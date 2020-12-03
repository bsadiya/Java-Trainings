package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortMethodDemo {

	public static void main(String[] args) {
		
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(13);
		intArray.add(7);
		intArray.add(6);
		intArray.add(45);
		intArray.add(21);
		
		System.out.println("UnSorted ArrayList: "+ intArray);
		Collections.sort(intArray);
		System.out.println("Sorted ArrayList: "+intArray);
		Collections.sort(intArray, Collections.reverseOrder());
		System.out.println("descending order Integer ArrayList: "+ intArray);
		
		
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

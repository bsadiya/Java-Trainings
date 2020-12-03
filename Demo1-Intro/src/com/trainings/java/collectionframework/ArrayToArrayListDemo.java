package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayListDemo {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Raju");
		al.add("Sadiya");
		al.add("Shyam");
		al.add("Sai");
		
		System.out.println(al);
		System.out.println("*************");
		
		String[] a = new String[al.size()];
		al.toArray(a); // Returns an array containing all of the elements in this list inproper sequence
		// normal approach to print the data
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("*************");
		// for-each loop to print the data
		for (String s : a) {
			System.out.println(s);
		}
		
		System.out.println("*************");
		System.out.println(al);
		

	}

}

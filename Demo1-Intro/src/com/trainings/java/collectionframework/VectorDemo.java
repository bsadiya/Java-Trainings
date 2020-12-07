package com.trainings.java.collectionframework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("v1");
		v.add("v2");
		v.add("v3");
		v.add("v4");
		
		System.out.println(v);
		

		
		for(int i=0; i<5; i++) {
			v.add("vector");
		}
		System.out.println(v);
		v.add("v3");
		v.add("v4");
		System.out.println(v.size());
		System.out.println(v.capacity());
		
//		AL-50% ; Vector: 2*Capacity
		

	}

}

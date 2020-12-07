package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("v1");
		v.add("v2");
		v.add("v3");
		v.add("v4");
		
		System.out.println(v);
		
		Enumeration e = v.elements() ; // hasMoreElements , nextElement
		
		while(e.hasMoreElements()) {
			System.err.println(e.nextElement());
		}

		
		ArrayList<String> al = new ArrayList<>();
		
		Enumeration ale = Collections.enumeration(al); //V1.2
		
//		al.get(0);
		
		for (String s : al) {
			System.out.println(s.toLowerCase());
		} 
		
		while(ale.hasMoreElements()) {
			System.err.println(ale.nextElement());
		}
		
		Collections.synchronizedCollection(al);
		
		
	}

}

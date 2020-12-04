package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationCursorDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Raju");
		al.add("Sadiya");
		al.add("Shyam");
		al.add("Sai");
		Enumeration<String> e = Collections.enumeration(al);
		while (e.hasMoreElements()) {
			String str = e.nextElement();
			System.out.println(str);
		}

	}

}

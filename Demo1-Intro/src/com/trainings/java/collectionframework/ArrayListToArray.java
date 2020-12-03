package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add('c');
		al.add("Java");
		// conversion of ArrayList to array
		Object[] o = al.toArray();
		for (Object oo : o) {
			System.out.println(oo);
		}
		
		String[] str = { "Raju", "Sadiya", "Ram" };
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(str));
		al1.add("newperson-1");
		al1.add("newperson-2");
		// printing data by using enhanced for loop
		for (String s : al1) {
			System.out.println(s);
		}

	}

}

package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class SubListAndSwappingDemo {

	public static void main(String[] args) {
		{
			ArrayList<String> a1 = new ArrayList<String>();
			a1.add("Raju");
			a1.add("Sadiya");
			a1.add("Sai");
			a1.add("Shyam");
			ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 3)); // 1, 2 index strings
			System.out.println(a2);
			ArrayList<String> a3 = new ArrayList<String>(a1.subList(1, a1.size()));
			System.out.println(a3);
			// java.lang.IndexOutOfBoundsException: toIndex = 7
			// ArrayList<String> a4 = new ArrayList<String>(a1.subList(1,7));
			System.out.println("before swapping=" + a1);
			Collections.swap(a1, 1, 3);
			System.out.println("after swapping=" + a1);
		}


	}

}

package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InitializeValuesToArrayList {
	public static void main(String[] args) {

//	normal approach to initialize the data
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Raju");
		alist.add("Sadiya");
		System.out.println(alist);
		
//	initializing ArrayList by using asList()
		String[] names = new String[3];
		int a[] = new int[2];
		String days[] = {"Sun", "Mon", "Fri"};
		ArrayList al = new ArrayList(Arrays.asList(a));
		System.out.println(al);

//	adding objects into ArrayList by using anonymous inner classes
		ArrayList<String> al1 = new ArrayList<String>() {
			{
				add("Raju");
				add("Sadiya");
			}
		};
		System.out.println(al1);
		
//	Arrays to ArrayList - ArrayList<Type> obj = new ArrayList<Type>(Collections.nCopies(count, object));
		Emp e1 = new Emp(111,"Raju");
		ArrayList<Emp> empList = new ArrayList<Emp>(Collections.nCopies(5,e1));
		for (Emp e : empList) {
			System.out.println(e.ename + "---" + e.eid);
		}
	}



}

class Emp{
	String ename;
	int eid;
	public Emp(int i, String string) {
		eid = i;
		ename = string;
	}
}

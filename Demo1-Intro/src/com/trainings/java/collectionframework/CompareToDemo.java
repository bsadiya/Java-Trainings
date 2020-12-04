package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;

public class CompareToDemo {

	public static void main(String[] args) {
		
		 //Integer, Boolean, Double, ....String --->Implements Comparable interface...so sorting will be applied....
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Raju");
		names.add("Sadiya");
		names.add("Shyam");
		names.add("Sai");
		
		System.out.println("Raju".compareTo("Sadiya")); // 0 , -ve, +ve
		
		System.out.println("Raju".toLowerCase());
		
		Collections.sort(names);
		System.out.println(names);
		
		
//		---------------------- Comparable/Comparator -->Interfaces
		
		ArrayList<Test> test = new ArrayList<>();
		test.add(new Test(4));
		test.add(new Test(6));
		test.add(new Test(9));
		test.add(new Test(1));
		
		System.out.println(test); // com.trainings.java.collectionframework.Test@7d6f77cc -- reference --- Hashcode -->ClassName@hashcode
//		Collections.sort(test); 
		
//		Comparable --->compareTo() ->Functional Interfaces --Java8
//		Comparator --> compare()
		
		for(Test t : test) {
			System.out.println(t.rating);
		}
		
		System.out.println("------------------------");
		
		Movie movie1 = new Movie(5,"3Idiots");
		Movie movie2 = new Movie(2,"DDLJ");
		Movie movie3 = new Movie(4,"Raabta");
		Movie movie4 = new Movie(1,"Bahubali");
		Movie movie5 = new Movie(3,"RRR");
		
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		
		System.out.println(movies);
		
		Collections.sort(movies);
		
//		System.out.println(movies);
		Iterator itr = movies.iterator(); // Iterator itr = <collection -list/set/map>.iterator();
		while (itr.hasNext())
		{
			Movie m = (Movie) itr.next();
			System.out.println(m.rating + "---" + m.name);
		}
	
		System.out.println("**************");

		Comparator<Movie> mc= new MovieNameComparator();
		Collections.sort(movies, mc);
		
		Enumeration<Movie> e = Collections.enumeration(movies);
		while (e.hasMoreElements()) {
			Movie m = e.nextElement();
			System.out.println(m.name);
		}
		

	}

}



class Test{
	int rating;
	String name;
	
	public Test(int rating) {
		super();
		this.rating = rating;
	}
	
}


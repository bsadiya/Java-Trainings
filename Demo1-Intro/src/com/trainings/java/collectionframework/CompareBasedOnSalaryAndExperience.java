package com.trainings.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CompareBasedOnSalaryAndExperience {

	public static void main(String[] args) {

		RSEmployee employee1 = new RSEmployee(12345, "Raju", 90000, 9.3);
		RSEmployee employee2 = new RSEmployee(34567, "Sadiya", 90000, 6.3);
		RSEmployee employee3 = new RSEmployee(56789, "Raju", 90000, 6.3);
		RSEmployee employee4 = new RSEmployee(23456, "Sadiya", 90000, 5.3);
		RSEmployee employee5 = new RSEmployee(45678, "Sanju", 90000, 5.3);
		
		List<RSEmployee> rsEmployees = new ArrayList<>();
		rsEmployees.add(employee1);
		rsEmployees.add(employee2);
		rsEmployees.add(employee3);
		rsEmployees.add(employee4);
		rsEmployees.add(employee5);
		
//		System.out.println(rsEmployees);
		Collections.sort(rsEmployees);
		Iterator itr = rsEmployees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

class RS{
	
}

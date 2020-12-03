package com.trainings.java.collectionframework;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysVsCollections {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		int[] array = new int[5];
		int[] a = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(array));
		Employee e[] = new Employee[10];
		System.out.println(Arrays.toString(e));
		
		Employee emps = new Employee();
		
		System.out.println(emps.toString());
//		emps[0]=1;
		
//		array[6] // ArrayIndexOutOfBoundException
		
		ArrayList arrayList = new ArrayList(2); // initial capacity --10 --15
		
		System.out.println("Array Capacity: "+ getCapacity(arrayList));
		System.out.println("Array size: "+arrayList.size() );
		
		Integer i = new Integer(1); // Wrapper classes--Premitive- Wrapper ---> int -->Integer. char-->Charater, boolean-Boolean, double--Double
		arrayList.add(i);

		System.out.println("Array Capacity: "+ getCapacity(arrayList));
		System.out.println("Array size: "+arrayList.size() );
		
		arrayList.add(null);
		
		System.out.println("Array size: "+arrayList.size() );
		System.out.println("Array Capacity: "+ getCapacity(arrayList));
		
		arrayList.add(1); // Auto-Boxing
		
		System.out.println("Array size: "+arrayList.size() );
		System.out.println("Array Capacity: "+ getCapacity(arrayList));
		
		
		arrayList.add("String");
		arrayList.add(null);
		arrayList.add("String");
		arrayList.add(1.0);
		arrayList.add('c');
		
		
		System.out.println("Array size: "+arrayList.size() );
		System.out.println("Array Capacity: "+ getCapacity(arrayList));
		
//		String myElement = (String) arrayList.get("String");
		
		System.out.println(arrayList);
		
			Collection collection = null;
			Collections collections = null;
			
			
			
			List list = Arrays.asList("Sadiya","Raju","Shyam", "Sai");
			ArrayList<String> declaration1 = new ArrayList<String>(list);
			System.out.println(declaration1.size());

		ArrayList<String> declaration2 = new ArrayList<String>() {
			{
				add("Raju");
				add("Sadiya");
			}
		};
		System.out.println(declaration2.size());

		// convert Array to ArrayList
		ArrayList<String> al = new ArrayList<String>();
		String[] strArray = { "Raju", "Sadiya", "Sai" };
		Collections.addAll(al, strArray);
		System.out.println(al);

System.out.println("---------------");
		
		ArrayList<String> genericArrayList = new ArrayList<String>(); //  String[] strarray = new String[2];--> Array/List
		genericArrayList.add("Sadiya");
		genericArrayList.add("Raju");
		genericArrayList.add("Shyam");
		genericArrayList.add("SAi");
		
		System.out.println(genericArrayList);
		System.out.println(genericArrayList.indexOf("Raju"));
		System.out.println(genericArrayList.remove(0));
		
		System.out.println(genericArrayList);
		System.out.println("---------------");		
		
	}
	
	static int getCapacity(ArrayList l) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field f =ArrayList.class.getDeclaredField("elementData");
		f.setAccessible(true);
		return ((Object[])f.get(l)).length; 
	}
	

	
	
	
	

}

class Employee{

	@Override
	public String toString() {
		return "Employee Class";
	}
	
}

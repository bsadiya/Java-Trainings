package com.trainings.java.demo.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysClassDemo {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[1] = 100;
		System.out.println(Arrays.toString(a));

		Emp e1 = new Emp(111,"Raju");
		Emp e2 = new Emp(222,"Sadiya");
		Emp e3 = new Emp(333,"Sai");
		
		Emp[] e = new Emp[5];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		System.out.println(Arrays.toString(e));
		
		
//		copy the data from one array to another array
		
		int[] copyfrom={10,20,30,40,50,60,70,80};
		int[] copyto = new int[7];
		System.arraycopy(copyfrom,1,copyto,0,7);
		for (int cc:copyto)
		{ 
			System.out.println(cc);
		}
		
//		copy the data from one array to another array
		System.out.println("copyOfRange");
		int[] copyfrom1={10,20,30,40,50,60,70,80};
		int[] newarray=Arrays.copyOfRange(copyfrom1,1,4);
		for (int aa:newarray)
		{ 
			System.out.println(aa);//20 30 40
		}
		
	
        
	}

}

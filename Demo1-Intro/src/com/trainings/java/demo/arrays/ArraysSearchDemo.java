package com.trainings.java.demo.arrays;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		
		// Linear, Binary
		
		 int[] a1= {10,20,30,50,70,90};    
	        int key = 10; 
	        for(int i=0;i<a1.length;i++)
	        {    
	            if(a1[i] == key)
	            {    
	            	System.out.println(key+" is found at index: "+i) ; 
	            	break;
	            }   
	            System.out.println("i:"+i);
	        }
	        System.out.println("Out of the loop!!!");
		}
	
}

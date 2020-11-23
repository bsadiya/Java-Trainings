package com.trainings.java.inheritancedemo;

public class SuperDemo {

	public static void main(String[] args) {
//		BB b = new BB();
		
		BB b = new BB(11, 22);
		

	}

}

class AA{
	
	final int x=100;
	int y= 200;
}

class BB extends AA{
	
	int x =10; 
	int y =20;
	
	
	int a = 1;
	int b = 2;
	
	BB(){
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		System.out.println("Parent a: "+ super.x);
		System.out.println("Parent b: "+ super.y);
	}
	
	BB(int a, int b){ // a, b - local variables ;  x, y -- Current class Variables -- this; 
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		 
		System.out.println("a: "+this.a);
		System.out.println("b: "+this.b);
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
		System.out.println("Parent x: "+ super.x); // Parent Class variables -- Super keyword
		System.out.println("Parent y: "+ super.y);
	}
	
}

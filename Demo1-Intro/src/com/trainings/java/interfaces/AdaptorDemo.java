package com.trainings.java.interfaces;

public class AdaptorDemo extends MyAdaptorClass {

	
	@Override
	public void m1() {
		System.out.println("m1 Method");
	}
	
	public static void main(String[] args) {
		
		
	}

}


interface MyInterface{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
//	............ 
}


class MyAdaptorClass implements MyInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
}
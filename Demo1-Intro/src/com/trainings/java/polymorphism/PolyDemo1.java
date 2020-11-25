package com.trainings.java.polymorphism;

public class PolyDemo1 {

	public void methodOne(String s) {
		System.out.println("String version");
	}

	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) {
		PolyDemo1 t = new PolyDemo1();
		t.methodOne("arun");// String version
		t.methodOne(new StringBuffer("sai"));// StringBuffer version
//		t.methodOne(null);// The method methodOne(String) is ambiguous for the type PolyDemo1
	}

}

class PolyTest {
	public void methodOne(int i, float f) {
		System.out.println("int-float method");
	}

	public void methodOne(float f, int i) {
		System.out.println("float-int method");
	}

	public static void main(String[] args) {
		PolyTest t = new PolyTest();
		t.methodOne(10, 10.5f);// int-float method
		t.methodOne(10.5f, 10);// float-int method
//t.methodOne(10,10); //C.E:
//CE:reference to methodOne is ambiguous,
//both method methodOne(int,float) in Test
//		t.methodOne(10.5f,10.5f);
	}
}
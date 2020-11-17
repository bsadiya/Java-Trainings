package com.trainings.java.demo.arrays;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]=111;
		for (int a1:a)
		{ 
			System.out.println(a1);
		}
		
//		empObjectArray();
		
//		objectArraysDemo();
		
		objectArraysDemo1();
		
		
}

	private static void objectArraysDemo1() {
		Object[] a=new Object[10];
		
		a[0]=new Integer(10);//(valid)
		a[1]=new Object();//(valid)
		a[2]=new String("Raju");//(valid)
		a[3] = 100;
		
		Number[] n=new Number[10];
		n[0]=new Integer(10);//(valid)
		n[1]=new Double(10.5);//(valid)
//		n[2]=new String("Raju");//Error:incompatible types//(invalid)
		
		for (Object ee:a)
		{ 
			System.out.println(ee); 
		}
		
		
	}

	private static void empObjectArray() {
		Emp e1 = new Emp(111,"Raju");
		Emp e2 = new Emp(222,"Sadiya");
		Emp e3 = new Emp(333,"Sai");
		
		
		Emp[] e = new Emp[5];
		
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for (Emp ee:e)
		{ 
			System.out.println(ee); 
		}
	}

	
	
	
	
	
	
	
	private static void objectArraysDemo() {
		Object[] a= new Object[6];
		
		a[0]=new Emp(111,"Raju");
		a[1]=new Integer(10);
		a[2]=new Student(1,"Sadiya");
		for (Object a1:a)
		{
			if (a1 instanceof Emp) {
				Emp e1 = (Emp) a1;
//				Emp e1 = new EMP(111,"Raju");
				System.out.println(e1.empId + "---" + e1.empName); //111---Raju
			}
			if (a1 instanceof Student) {
				Student s1 = (Student) a1;
				System.out.println(s1.id + "---" + s1.name);
			}
			if (a1 instanceof Integer) {
				System.out.println(a1);
			}
			if (a1 == null) {
				System.out.println(a1);
			}

		}

}

}
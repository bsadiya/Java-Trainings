package com.trainings.java.objectclass;

import java.util.Objects;

import com.trainings.java.collectionframework.RSTechnologies;

public class ObjectClassMethodsUsage {

	public static void main(String[] args) {
		MyClass myobj = new MyClass();
		
		//			1. toString()
		// without implementing toString() --return getClass().getName() + "@" +
		// Integer.toHexString(hashCode());
		System.out.println(myobj.toString()); // com.trainings.java.objectclass.MyClass@5d22bbb7

		MyClass myobj1 = new MyClass();
		System.out.println(myobj1.toString()); // com.trainings.java.objectclass.MyClass@123772c4
		
		System.out.println("The name of class RSTech is: "+RSTechnologies.class.getSimpleName());
		
		
		// 2. Hashcode()
		System.out.println("Hashcode of myobj: "+myobj.hashCode());
		System.out.println("Hashcode of myobj: "+myobj1.hashCode());
		
	}

}

class MyClass {

	int i;
	String s;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
	
	
	
	
}
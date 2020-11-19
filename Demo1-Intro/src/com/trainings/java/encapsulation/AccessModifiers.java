package com.trainings.java.encapsulation;

public class AccessModifiers {

	int default_d;
	private int private_i;
	public int public_j;
	protected int protected_k;
	
	public static void main(String[] args) {
		// default, public, private, protected
		AccessModifiers am = new AccessModifiers();
		am.private_i = 10; // valid
		int j =20;
		am.setI(j);
	}
	
	public void setI(int i) {
		this.private_i= i;
	}

	public void wish() {
		System.out.println("Good Mrng!!!"); 
		
	}
	

	protected void protectedWish() {
		System.out.println("Good Mrng!!!"); 
		
	}

}


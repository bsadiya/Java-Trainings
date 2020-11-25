package com.trainings.java.abstraction;

public abstract class Bank {

	public static void main(String[] args) {
		System.out.println("Main");
		
//		Bank ban = new Bank();
		Bank sbi = new SBI();
		
		SBI sbi1 = new SBI();

			sbi.bankGuidelines();
			sbi.wish();
//			sbi.sbiMethod()sbi;// invalid
			
			
			sbi1.bankGuidelines();
			sbi1.sbiMethod();
			
//			Bank ban = new Bank();
			Bank ban = new Bank() {
				void wish() {
					System.out.println("Anonymous obj");
				}
			};
			
			ban.wish();
			
		}
		

	
	abstract void wish();
	
	void bankGuidelines() {
		System.out.println("RBI Guidelines...");
	}

}


class SBI extends Bank {
	void wish(){
		System.out.println("Welcom to SBI!!!!");
	}
	
	void sbiMethod() {
		System.out.println("SBI method!!!!");
	}
}

class Citi extends Bank {

	@Override
	void wish() {
		System.out.println("Welcom to Citi Bank!!!!");
		
	}
	
}


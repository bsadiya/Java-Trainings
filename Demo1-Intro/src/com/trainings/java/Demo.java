package com.trainings.java;

public class Demo {

	public static void main(String[] args) {
		
		int i =97;
		char c = (char) i;
		System.out.println(c);
		
		Throwable a = new Throwable();
		Object b=  new RuntimeException();
		System.out.println(a instanceof RuntimeException);
		
		long b1 = 127;
		long b2 = 0;
		int b3 =  (int) (b1+b2);
		
		double inf = 10/0.0;
		System.out.println("infinity: "+inf);
		
		int x,y;
		x =10;
		
//		System.out.println(++4);// 4=4+1
		
		++x;
		y=++x; // y= (x=x+1)
		System.out.println("x: "+x);//12
		System.out.println("y: "+y);//12
		x++;
		y=x++; // y= (x)
		System.out.println("x: "+x);//14
		System.out.println("y: "+y);//13
		++x;
		System.out.println("x: "+x);//15
		System.out.println("y: "+y);//13
		
		char ch = 'a';
		int inta = ch;
		System.out.println(inta);
		
		ch++;
		System.out.println((int)ch);
		
		Provider provider = new Provider();
		provider.setProviderId(112200);
		provider.setProviderName("ABCHospital");
				
		Member member = new Member();
		member.setName("Raju");
		member.setProvider(provider);
		
		Insurer ins = new Insurer("ABCInsurance");
		ins.addMember(member);
		
		System.out.println(ins.getMemberInfo());
	}
	
}

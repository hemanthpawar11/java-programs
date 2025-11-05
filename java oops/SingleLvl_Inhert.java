package com.OOPS;

class A{
	int a =10;
	
}

class B extends A{
	int b =20;
	
}

public class SingleLvl_Inhert {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println("a from A Class : "+b1.a);
		System.out.println("b from B Class : "+b1.b);
		
	}
}

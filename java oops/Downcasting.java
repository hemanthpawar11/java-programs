package com.OOPS;

class Parent1{
	int a =30;
}
class Child1 extends Parent1{
	int b =50;
}

public class Downcasting {

	public static void main(String[] args) {
		Parent1 p = new Child1();
		System.out.println("Upcasting:");
		System.out.println(p.toString());
		System.out.println(p.a);
//		System.out.println(p.b); CTE
		System.out.println();
		
		System.out.println("Downcasting:");
		Child1 c = (Child1)p;
		System.out.println(c.toString());
		System.out.println(c.a);
		System.out.println(c.b); // Now we can access child class members.

	}

}

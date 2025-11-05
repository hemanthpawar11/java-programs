package com.OOPS;

class Parent{
	int a =10;
}
class Child extends Parent{
	int b =20;
}

public class Upcasting {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.toString());
		System.out.println(p.a);
		// System.out.println(p.b); CTE , Becoz Can't able to access child class members in Upcasting.

	}

}

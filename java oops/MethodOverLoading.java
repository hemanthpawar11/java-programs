package com.OOPS;

class Multiply{
	 int multiply(int a,int b) {
		return a*b;
	}
	 int multiply(int a,int b,int c) {
		return a*b*c;
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Multiply m = new Multiply();
		System.out.println(m.multiply(4,5));
		System.out.println(m.multiply(2, 3, 5));
	}

}

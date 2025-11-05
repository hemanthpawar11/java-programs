package com.OOPS;

class C{
	int a=10;
	
}
class D extends C{
	int b =20;
}
class E extends D{
	int c =30;
}

public class MultiLvl_Inherit {

	public static void main(String[] args) {
		
		E e1 = new E();
		System.out.println("Variable of Class C: "+e1.a);
		System.out.println("Variable of Class D: "+e1.b);
		System.out.println("Variable of Class E: "+e1.c);

	}

}

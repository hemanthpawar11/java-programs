package com.OOPS;

class Car2{
	String name;
	String color;
	int price;
	
	Tyre2[] t2 =new Tyre2[4]; 
	int i = 0;
	void addtyre(Tyre2 t2) {
		this.t2[i++] = t2;
	}
	
	public Car2(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
}

class Tyre2{
	String name;
	int price;
	
	public Tyre2(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}

public class Aggregation {
	
	public static void main(String[] args) {
		Car2 c2 = new Car2("BMW","Blue",1000000);
		
		c2.addtyre(new Tyre2("MRF",350));
		c2.addtyre(new Tyre2("CEAT",450));
		c2.addtyre(new Tyre2("JK",750));
		c2.addtyre(new Tyre2("APPOLO",600));
		
		System.out.println(c2.name);
		System.out.println(c2.color);
		System.out.println(c2.price);
		System.out.println();
		
		System.out.println(c2.t2);
		System.out.println();
		
		for(int i =0;i<c2.t2.length;i++) {
			System.out.println(c2.t2[i].name+" "+c2.t2[i].price);
		}
		
	}

}

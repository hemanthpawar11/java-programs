package com.OOPS;
class Car1{
	String name;
	String color;
	int price;
	
	Tyre[] t = { new Tyre("CEAT",350),
			new Tyre("JK",450),
			new Tyre("APPOLO",750),
			new Tyre("MRF",1000) };
	
	public Car1(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
}

class Tyre{
	String name;
	int price;
	
	public Tyre(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	}
	
	


public class Relationship_Comp_OneToMany {

	public static void main(String[] args) {
		Car1 c1 = new Car1("BMW","Blue",3000);
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.price);
		System.out.println();
		
		System.out.println(c1.t);
		System.out.println();
		
		for(int i=0;i<c1.t.length;i++) {
		System.out.println(c1.t[i].name+" "+c1.t[i].price);
		
		}
		
		

	}

}



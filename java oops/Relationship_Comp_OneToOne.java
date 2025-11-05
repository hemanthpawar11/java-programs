package com.OOPS;
class Car{
	String name;
	String color;
	int price;
	
	Engine e = new Engine(1000,"Diesel");
	
	public Car(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	
}
class Engine{
	int hp;
	String type;
	
	public Engine(int hp, String type) {
		super();
		this.hp = hp;
		this.type = type;
	}
	
	
}

public class Relationship_Comp_OneToOne {

	public static void main(String[] args) {
		Car c = new Car("BMW","Blue",3000);
		
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println();
		
		System.out.println(c.e);
		System.out.println();
		
		System.out.println(c.e.hp);
		System.out.println(c.e.type);
		
		
		

	}

}

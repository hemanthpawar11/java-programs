package com.OOPS;

class Person{
	String name;
	int age;
	
	Person() {
		this.name="Unknown";
		this.age=0;
	}
	Person(String name){
		this.name=name;
		this.age=0;
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+age;
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		

	}

}

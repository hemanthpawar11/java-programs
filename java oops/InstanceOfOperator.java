package com.OOPS;
class Cab1{
	int price;
}
class Mini1 extends Cab1{
	int price;
}
class Sedan1 extends Cab1{
	int price;
}
class Lux1 extends Cab1{
	
}

public class InstanceOfOperator {

	public static void main(String[] args) {
		Cab1 c = new Mini1();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Cab1);
		System.out.println(c instanceof Mini1);
		System.out.println(c instanceof Sedan1);
	}
}

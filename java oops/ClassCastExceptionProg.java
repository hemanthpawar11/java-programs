package com.OOPS;

class Cab{
	int price=10;
}
class Mini extends Cab{
	int price=100;
}
class Sedan extends Cab{
	int price=1000;
}
class Lux extends Cab{
	int price=10000;
}

public class ClassCastExceptionProg {

	public static void main(String[] args) {
		Cab c = new Mini();
		System.out.println(c.toString());
		System.out.println(c.price);
		System.out.println();
		
		Mini m = (Mini)c;
		System.out.println(m.price);
		
		Sedan s = (Sedan)c;
		System.out.println(s.price);

	}

}

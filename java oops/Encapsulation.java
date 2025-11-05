package com.OOPS;
class Demo{
	private String sname ="Bawin";
	
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname =sname;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Demo d =new Demo();
		System.out.println("Sname : "+d.getName());
		d.setName("Dinga");
		System.out.println("Sname : "+d.getName());
		

	}

}

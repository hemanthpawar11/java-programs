class demo 
{
	int stu;
	String name;
	int age;
	demo (int stu,String name,int age)
	{
		this.stu=stu;
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) 
	{
		demo d1= new demo (7603,"arun",22);
		System.out.println(d1.stu);
		System.out.println(d1.name);
		System.out.println(d1.age);
		
		demo d2 = new demo (786,"hemanth",20);
		System.out.println(d2.stu);
		System.out.println(d2.name);
		System.out.println(d2.age);
	}
}

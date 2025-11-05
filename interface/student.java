Class Student implements Comparable  
{
	int age;
	String name;
	Student(int age, String name)
	{
		super();
		this.age=age;
		this.name=name;
	}
	//overriding
	public int compareTo (Object o)
	{
		Student S1 - (Student)o;
		return this.age = S.age;
	}
}

		class driver
		{
			
		
	public static void main(String[] args) 
	{
		Student S1= new Student(21,"dinga");
                System.out.println (S1.age); // 21
		System.out.println (S1.name);        // dinga
 
		
		Student S2= new Student(23,"punch");
                System.out.println (S1.age); // 23
		System.out.println (S1.name);        // punch
		
		System.out.println(S1.age==S2.age);

		System.out.println(S1.compareTo(S2));

		System.out.println(S2.compareTo(S1));

 		System.out.println("Hello World!");
	}
}

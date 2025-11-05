class Student_1 implements Comparable  
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
		student s = (student )o;
		return this.age = s.age;
	}
}

		class driver
		{
			
		
	public static void main(String[] args) 
	{
		int [] a = new int [5];
		Student[] S = new Student[5];
		S[0]= new Student (20,"Dinga");
		S[0]= new Student (29,"Linga");
		S[0]= new Student (40,"Ranga");
		S[0]= new Student (25,"Dingi");
		S[0]= new Student (19,"Ram");
	}
}

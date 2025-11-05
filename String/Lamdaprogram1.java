interface Cal
{
	public abstract void marry();
}

class Driver_1
{
	public static void main(String[] args) 
	{
		
		 Cal p = () -> {
		System.out.println("Hello");
		};
		p.marry();  
		
	}
}

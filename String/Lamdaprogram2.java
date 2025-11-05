interface Cal
{
	public abstract int Caladd();
}

class Driver_2
{
	public static void main(String[] args) 
	{
		
		 Cal p = () -> {
		return 79;
		};
		
		System.out.println(p.Caladd());
	}
}






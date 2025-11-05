class bank
{
	String name = "arjun";
	private int pincode = 1212;
	String address = " 100 bharathi nagar";
	private long number = 9345772940l;
	
	
	int getpincode()
	{
		return pincode;
			
	}
	long getnumber()
	{
		return number;
	}
}

class driver
{
	public static void main(String[] args) 
	{
		
		bank l=new bank();
			
		System.out.println(l.name);
		System.out.println(l.address);
		System.out.println(l.getpincode());
		System.out.println(l.getnumber());
	}
}

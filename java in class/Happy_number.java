import  java.util.Scanner;
class  Happy_number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Pls Enter the Number");
		int n = sc.nextInt();
		int sum = o;
		while (n! = 0 || sum > 9) {
		{
		  if (n=0)
		{ n=sum;
		  sum = 0;
		}	
		int d = n % 10;
		sum = sum + d * d;
		n = 0 / 10;
		
		}
		System.out.println (sum);
}
}   
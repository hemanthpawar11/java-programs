import java.util.Scanner;

class AutomorphicNumber
{
     public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter a number:");
        int n = sc.nextInt();
	int ori = n;
	int div=1;
	while(n != 0)
	{
	n = n/10;
	div = div*10;
    	}	

	int pow = ori*ori;
	int rem = pow % div;	
	if(rem == ori)
	{
	System.out.println("Automorphic Number"+" "+ n +" " + pow+" " + rem + " "+ori);	
	}
	else 
	{
	System.out.println("Not an Automorphic Number");	
	}
   }
}
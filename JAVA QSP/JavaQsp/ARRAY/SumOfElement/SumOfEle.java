import java.util.Scanner;

class SumOfEle
{
     public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int[] a = new int[size];

	System.out.println("Enter the elements");
	for(int i=0;i<a.length;i++)
	{

	a[i]=sc.nextInt();

	}
	int sum = 0;
	for(int i=0;i<a.length;i++)
	{

	sum = sum + a[i];

	}
	System.out.println("The sum is:"+sum);
	
	
	}

}
import java.util.Scanner;

class SumOfEven
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
	int count = 0;
	for(int i=0;i<a.length;i++)
	{
	if(a[i]%2==0){
	sum = sum + a[i];
	count++;
	}

	

	}
	System.out.println("The sum of even num is:"+" "+sum + " "+"The Count is " +count);
	
	
	}

}
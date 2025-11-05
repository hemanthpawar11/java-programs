import java.util.Scanner;
class Jagged
{
	public static void main(String[] args) 
	{
		int [] [] a= new int [3] [];
		a[0]=new int[3];
		a[1]=new int[5];
		a[2]=new int[7];
		Scanner sc=new Scanner(System.in);
			for (int i = 0;i<a.length ;i++ )
			{
			for (int j = 0;j<a.length ;j++ )
			{ a[i] [j] = sc.nextInt();
 			}
			}
			for (int i=0; i<a.length; i++)
			{ for (int j= 0; j<a.length; j++)
			{ System.out.println (a[i] [j]);
			}
			}
		
		
	}
}

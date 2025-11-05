import java.util.Scanner;
class evenorodd
{
public static void main (String[] args)
{

System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for (int i=0;i<num;i++)
{ if(i%2==0){
System.out.println(i);

}

}

System.out.println("Count is" +  num/2);
}

}
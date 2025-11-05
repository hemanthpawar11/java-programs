import java.util.Scanner;
class evenorodd2
{
public static void main (String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number 1");

int num1 = sc.nextInt();
int count=0;
System.out.println("Enter the number 2");
int num2 = sc.nextInt();
 while(num1<=num2){
if(num1%2==0){
System.out.println(num1);
count++;

System.out.println("");
}
num1++;

}
System.out.println(count);
}
}


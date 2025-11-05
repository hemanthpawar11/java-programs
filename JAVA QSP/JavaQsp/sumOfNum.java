import java.util.Scanner;

class sumOfNum {
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number:");
  int num = sc.nextInt();
int rev=0;
int n1 = 0;
   while (num != 0)

{
 int rem = num%10;
 n1 = n1 + rem;
 num = num/10;



}
System.out.println("The sum of the given number is "+" " +n1);

}
}
import java.util.Scanner;

class palindrome {
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number to reverse");
  int num = sc.nextInt();
 int n = num;
  int rev = 0;
  while (num != 0)
{
 int rem = num%10;
 rev = rev*10 + rem;
 num = num/10;


}
if(n == rev)
{
System.out.println("The number is Palindrome :" + " " + n );}
else {
System.out.println("It is not the Palindrome" );}

}
}
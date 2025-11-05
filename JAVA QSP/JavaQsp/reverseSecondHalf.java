import java.util.Scanner;

class reverseSecondHalf {
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number to reverse");
  int num = sc.nextInt();

  int rev = 0;
  int num2 = num/2; 
  while (num != num2 )
{
 int rem = num%10;
 rev = rev*10 + rem;
 num = num/10;


}

System.out.println(num );


}
}
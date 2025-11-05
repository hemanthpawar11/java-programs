import java.util.Scanner;

class Factorial{
     public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter a number:");
        int n = sc.nextInt();

       isFact( n );


}

    public static void isFact( int n)
  {
   int fact = 1;
    for(int i = 1; i<=n; i++)
        {
         fact = fact*i;
        }
    System.out.println("The factorial of the number is" + " " + fact);

   }
  
}

import java.util.Scanner;

class StrongNumber{
     public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter a number:");
        int n = sc.nextInt();
          
          int sum = 0;
          int ori = n;

       while(n!=0)
    
        {
        int rem = n % 10;
        sum = sum+ printfact(rem);
        n = n/10;
  } 


   if(ori==sum){
    System.out.println("Strong Number");}

 else { 
       System.out.println("Not a Strong Number");
      }

   }
   public static int printfact(int  rem)
   {
      int fact = 1;
      for (int i=1;i<=rem;i++)
            {
              fact=fact*i;
             }
      return fact;
    }
  
}

/*  i/p= 145  1! + 4! + 5! = 145 ------ STRONG NUMBER */


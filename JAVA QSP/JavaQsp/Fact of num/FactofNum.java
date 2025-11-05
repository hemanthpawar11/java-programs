import java.util.Scanner;

class FactofNum{
     public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        System.out.println("Enter a number:");
        

        printFact(n);
 }
     
        public static void printFact(int num)
      {
       int count = 0; 
        for (int i=1;i<=num; i++)
           {
              if( num % i == 0)
                  {
                   System.out.println(i);
                   count++;
                    }
            }
            System.out.println("Total num of facts" + " " +count);
       }
}
        
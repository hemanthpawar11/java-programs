import java.util.Scanner;

class starPattern10{
public static void main (String[] args)
  {
  Scanner sc = new Scanner(System.in);
 
  int n = sc.nextInt();
 
  
  for (int i = 1; i <= n; i++)
           {
       for (int j =1 ; j<= n; j++)
              
              {
               
                 System.out.print(i+j +" ");
            
               }       
       
 System.out.println();
       
   }
  }
 }

/* output
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10
*/
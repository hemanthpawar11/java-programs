import java.util.Scanner;

class starPattern13{
public static void main (String[] args)
  {
  Scanner sc = new Scanner(System.in);
 
  int n = sc.nextInt();
  int star = n*2-1;
  int space =0;
  
  for (int i = 1; i <= n; i++)
           {
       for (int j =1 ; j<= space; j++)
              {
                      

                   
                 System.out.print("  ");
            
               }  
           for (int k=1; k<=star; k++){
                 System.out.print(" *");
                    }     
       star=star-2;
       space++;
 System.out.println();
       
   }
  }
 }   


/* output
 * * * * * * * * * * * * *
   * * * * * * * * * * *
     * * * * * * * * *
       * * * * * * *
         * * * * *
           * * *
             *
 */

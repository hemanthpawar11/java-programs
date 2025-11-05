import java.util.Scanner;

class starPattern12{
public static void main (String[] args)
  {
  Scanner sc = new Scanner(System.in);
 
  int n = sc.nextInt();
  char c= 'A';
  
  for (int i = 1; i <= n; i++)
           {
       for (int j =1 ; j<= n; j++)
              if(i==j){
                      

                      System.out.print(c++ + " ");  //char increment   
                      }
          else
              {
               
                 System.out.print(i+j-1 +" ");
            
               }       
      
 System.out.println();
       
   }
  }
 }

/*  output
A 2 3 4 5
2 B 4 5 6
3 4 C 6 7
4 5 6 D 8
5 6 7 8 E

*/
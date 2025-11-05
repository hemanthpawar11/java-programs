import java.util.Scanner;

class starPattern11{
public static void main (String[] args)
  {
  Scanner sc = new Scanner(System.in);
 
  int n = sc.nextInt();
  char c= 'A';
  
  for (int i = 1; i <= n; i++)
           {
       for (int j =1 ; j<= n; j++)
              if(i==j){
                      

                      System.out.print(c + " ");   
                      }
          else
              {
               
                 System.out.print(i+j +" ");
            
               }       
       c++;
 System.out.println();
       
   }
  }
 }

/*
A 3 4 5 6
3 B 5 6 7
4 5 C 7 8
5 6 7 D 9
6 7 8 9 E
*/
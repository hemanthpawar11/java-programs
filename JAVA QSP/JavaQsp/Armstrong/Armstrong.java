import java.util.Scanner;

class Armstrong{
     public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        int dc = count(n);

        if isArmstrong(n, dc)
           {

           System.out.println("Armstrong");

           }
        else 
           {
            
           System.out.println("Not an Armstrong");

           }

       public static int count(int num)
           {
              int count = 0;
              while (num != 0)
                   {
                     num = num/10;
                     count++;
                   }
               return count;

           }


}
}


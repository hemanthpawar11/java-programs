import java.util.Scanner;

class raisingNum {
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Number:");
 int num = sc.nextInt();
 for(int i =0; i<num;i++){
     int num2 = num%10;
      num= num/10;
       if (num < num2){System.out.println("yes");}
}
}
}



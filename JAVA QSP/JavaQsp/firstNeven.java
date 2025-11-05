import java.util.Scanner;

class firstNeven{
 public static void main(String[] args){
   
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Start number");
int s = sc.nextInt();
System.out.println("Enter the End number");
int e = sc.nextInt();
for (int i = s; i<=e;i++){

 if(i%2==0){
   System.out.println(i);
}


}
}
}
import java.util.Scanner;
 class GetInput
{
public static void main(String[] args)
{
 Scanner sc= new Scanner (System.in);
System.out.println ("Enter your name:");
 String name = sc.nextLine();
System.out.println ("Enter your age:");
byte age= sc.nextByte();
System.out.println ("Enter your Gender M/F:");
String gender = sc.next();
System.out.println ("Enter your Weight:");
byte weight = sc.nextByte();
System.out.println ("Enter your Contact:");
long contact = sc.nextLong();

System.out.println ("Details of the User are" + "Name is "+" " +name + " " +"Age is"+" " + age + " "+"Gender M/F"+" "  + gender + " "+"Weight in kg"+" "  + weight + " "+"Contact No"+" "  + contact);
}
}
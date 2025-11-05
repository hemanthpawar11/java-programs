import java.util.Scanner;


class Array2D{

	public static void addingElement(int[][] a){
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<a.length;i++){
		 for(int j = 0; j<a[i].length; j++){

			a[i][j] = sc.nextInt();
			}
		}
	
	}

	public static void printingElement(int[][] a){

	for(int i=0;i<a.length;i++){
		 for(int j = 0; j<a[i].length; j++){

			System.out.print(a[i][j]+ " ");
			}
		  System.out.println();
		}


	}
	public static void main(String[] args){
	int[][]a = new int[3][10];

	System.out.println("Enter the numbers");
	addingElement(a);


	System.out.printl("After adding");

	printingElement(a);

	
	
}
}
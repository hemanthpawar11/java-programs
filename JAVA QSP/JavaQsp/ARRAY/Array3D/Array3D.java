import java.util.Scanner;

class Array3D{

	public static void addingElement(int[][][] a){

	Scanner sc = new Scanner(System.in);
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			for(int k = 0; k<a[i][j].length; k++){
				a[i][j][k] = sc.nextInt();
			}
		}

	}

	}

	public static void printingElement(int[][][] a){
	
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			for(int k = 0; k<a[i][j].length; k++){
				System.out.print(a[i][j][k]+ " ");
			}

		}
		System.out.println();

	}

	}


	public static void main(String[] args){
	int[][][] a = new int[3][5][];

	a[0][0] = new int[1];
	a[0][1] = new int[2];
	a[0][2] = new int[3];
	a[0][3] = new int[4];
	a[0][4] = new int[5];

	a[1][0] = new int[1];
	a[1][1] = new int[2];
	a[1][2] = new int[3];
	a[1][3] = new int[4];
	a[1][4] = new int[5];

	a[2][0] = new int[1];
	a[2][1] = new int[2];
	a[2][2] = new int[3];
	a[2][3] = new int[4];
	a[2][4] = new int[5];

	System.out.println("Enter the number");
	addingElement(a);

	System.out.println("After adding the numbers");
	printingElement(a);
	
	
	
}
}
class Starpattern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i=n;i<=5;i++){
		{ for (int j=n;j<=5;j++ ){ 
		} if (j==1 || i==1 || j==5 || i==5 || i==j || i+j==6){
		   System.out.print("*");
			   }
			   else {
				   System.out.println(" ");
			   }
		}
		System.out.println(" ");
	}
}

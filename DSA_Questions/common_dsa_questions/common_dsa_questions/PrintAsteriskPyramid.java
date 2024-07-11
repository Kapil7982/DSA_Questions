package common_dsa_questions;

public class PrintAsteriskPyramid {

	public static void main(String[] args) {
		
		int n = 8;
		
		printAsteriskPyramid(n);
	}

	private static void printAsteriskPyramid(int n) {
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

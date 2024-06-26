package common_dsa_questions;

public class PrintEquilateralTriangle {

	public static void main(String[] args) {
		
		int n = 5;
		
		printEquilateralTriangle(n);
	}

	private static void printEquilateralTriangle(int n) {
		
		int width = (n*2)-1;
		
		for(int i=1; i<=n; i++)
		{
			int space = (width-(2*i-1))/2;
			
			int asterisks = 2 * i -1;
			
			for(int j=0; j<space; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<asterisks; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

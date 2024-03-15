package common_dsa_questions;

public class PatternII {

	public static void main(String[] args) {
		
		int n = 7;
		
		for(int i=0; i<=n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<2*n+1; i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=n-1; i>=0; i--)
		{
			for(int j=0; j<n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

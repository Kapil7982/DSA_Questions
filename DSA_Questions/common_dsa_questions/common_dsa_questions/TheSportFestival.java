package common_dsa_questions;

import java.util.Arrays;

public class TheSportFestival {

	public static void main(String[] args) {
		
		int[] arr = {3,1,2};
		
		int n = arr.length;
		
		theSportFestival(n,arr);

	}

	private static void theSportFestival(int n, int[] arr) {
		
		Arrays.sort(arr);
		
		int[][] mat = new int[n][n];
		
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				int bag = j-i;
				
				int sum = arr[j] - arr[bag];
				
                int c = mat[bag + 1][j];
				
				int c1 = mat[bag][j - 1];
				
				mat[bag][j] = Math.min(c, c1) + sum;
			}
		}
		System.out.println(mat[0][n-1]);
		
	}

}

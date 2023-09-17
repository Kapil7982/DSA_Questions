package common_dsa_questions;

public class TraverseA2DArray {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 3;
		
		
		int[][] matrix = {
				{1,8,9},
				{2,7,10},
				{3,6,11},
				{4,5,12}
			
				};
		traverseA2DArray(n,m,matrix);
	}

	private static void traverseA2DArray(int n, int m, int[][] matrix) {
		
		String bag = "";
		for (int i = m - 1; i >= 0; i--) {
		    for (int j = 0; j < n; j++) {
		        bag = bag + matrix[j][i] + " ";
		    }
		}
		System.out.println(bag);

		
	}
	
	

}

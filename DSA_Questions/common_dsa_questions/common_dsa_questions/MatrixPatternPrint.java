package common_dsa_questions;

public class MatrixPatternPrint {
	
	public static void main(String[] args) {
		
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        printElements(matrix);
	}

	private static void printElements(int[][] matrix) {
		
		int N = matrix.length;
        int mid = N / 2;
        
        //System.out.println(mid);
        
        for (int i = 0; i < N; i++) {
            if (i == mid) {
                System.out.print(matrix[i][i] + " ");
            } else {
                
                System.out.print(matrix[mid][N - 1 - i] + " ");
                System.out.print(matrix[i][mid] + " ");
                System.out.print(matrix[N - 1 - i][mid] + " ");
                System.out.print(matrix[mid][i] + " ");
                break;
            }
        }
        System.out.println();
	}

}

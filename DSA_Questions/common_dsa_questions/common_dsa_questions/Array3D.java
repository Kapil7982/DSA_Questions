package common_dsa_questions;

public class Array3D {

	public static void main(String[] args) {
		
		int n = 2;
		
		int m = 2;
		
		int k=2;
		
		int[][][] arr= {
	            {
	                {1, 2, 3, 4, 5},
	                {6, 7, 8, 9, 10},
	                {11, 12, 13, 14, 15},
	                {16, 17, 18, 19, 20}
	            },
	            {
	                {21, 22, 23, 24, 25},
	                {26, 27, 28, 29, 30},
	                {31, 32, 33, 34, 35},
	                {36, 37, 38, 39, 40}
	            },
	            {
	                {41, 42, 43, 44, 45},
	                {46, 47, 48, 49, 50},
	                {51, 52, 53, 54, 55},
	                {56, 57, 58, 59, 60}
	            }
	        };
	        array3D(n,m,k, arr);

	}

	private static void array3D(int n, int m, int k, int[][][] arr) {
		
		for(int i=0; i <n; i++) 
		{
            for(int j=0; j<m; j++) 
            {
                StringBuilder bag = new StringBuilder();
                for(int l=0; l<k; l++) 
                {
                    bag.append(arr[i][j][l]).append(" ");
                }
                System.out.println(bag);
            }
        }
		
	}

}

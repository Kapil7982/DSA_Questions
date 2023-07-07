package common_dsa_questions;

public class MatrixPrimeCheck {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

		int n = arr.length;
		
		int m = arr[0].length;
		
		matrixPrimeCheck(n, m, arr);
	}

	private static void matrixPrimeCheck(int n, int m, int[][] arr) {

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (isPrime(arr[i][j])) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	private static boolean isPrime(int num) {
		
		if(num <=1)
        {
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        
        return true;
		
	}

}

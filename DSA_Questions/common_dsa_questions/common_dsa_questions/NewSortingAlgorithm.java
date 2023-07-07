package common_dsa_questions;

public class NewSortingAlgorithm {

	public static void main(String[] args) {
		
		int[] arr = {12,18,17,65,46};
		
		int n = arr.length;
		
		int k = 6;
		
		newSortingAlgorithm(arr,k,n);
        for( int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
		
	}

}

	private static void newSortingAlgorithm(int[] arr, int k, int n) {
		
		for (int i=0; i<n-1; i++)
        {
             for (int j=0; j<n-i-1; j++)
             {
                 if (arr[j]%k > arr[j+1]%k)
                 {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
        }
		
	}
}
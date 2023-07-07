package common_dsa_questions;

public class SortOut {

	public static void main(String[] args) {
		
		int[] arr = {4,5,3,7,1};
		
		int n = arr.length;
		
		sortOut(n,arr);

	}

	private static void sortOut(int n, int[] arr) {
		
		int[] array = new int[n];
		
        for(int i=0; i<n; i++) 
        {
            array[i] = i;
        }

        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n-i-1; j++) 
            {
                if(arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++) 
        {
            System.out.print(array[i] + " ");
        }
	}

}

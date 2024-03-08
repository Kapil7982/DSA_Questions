package common_dsa_questions;

public class RotateArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		int k = 3;
		
		rotate(arr, k);
		
		for (int num : arr) {
            System.out.print(num + " ");
        }

	}

	private static void rotate(int[] arr, int k) {
		
		int n = arr.length;
		k%=n;
		
		reverse(arr, 0, n-1);
		reverse(arr,0, k-1);
		reverse(arr,k,n-1);
		
	}

	private static void reverse(int[] arr, int k, int i) {
		
		while(k< i)
		{
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
			k++;
			i--;
		}
		
		
	}

}

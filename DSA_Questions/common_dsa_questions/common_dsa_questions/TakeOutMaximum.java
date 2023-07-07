package common_dsa_questions;

public class TakeOutMaximum {

	public static void main(String[] args) {
		
		int[] arr = {-1, -1, -2, 1, -2, 4, 1, 9, 3, 9};
		
		int k = 3;
		
		int n = arr.length;
		
		int sum=0;
		
		int max=0;
		
		for(int i=0; i<k; i++)
		{
			sum += arr[i];
		}
		
		max = Math.max(sum, max);
		
		for(int i=k; i<n; i++)
		{
			sum -= arr[i-k];
			
			sum += arr[i];
			
			max = Math.max(sum, max);
		}
		
		System.out.println(max);

	}

}

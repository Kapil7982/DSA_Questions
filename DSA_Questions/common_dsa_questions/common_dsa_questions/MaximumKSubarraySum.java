package common_dsa_questions;

public class MaximumKSubarraySum {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 6, 2, 4, 7, 8};
        int k = 3;
        System.out.println(maximumKSubarraySum(arr, k));

	}

	private static int maximumKSubarraySum(int[] arr, int k) {
		
		int max=0;
		int n = arr.length;
		
		for(int i=0; i<=n-k; i++)
		{
			int sum=0;
			
			for(int j=i; j<i+k; j++)
			{
				sum+= arr[j];
			}
			if(sum>max)
			{
				max = sum;
			}
		}
		
		return max;
		
	}

}

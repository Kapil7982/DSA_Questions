package common_dsa_questions;

public class CalculateCartCost {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3};
		
		int[] arr = {1,2,3,4};
		
		//int[] arr1 = {3,2,1};
		
		int[] arr1 = {1,2,2,2};
		
		int n = arr.length;
		
		int sum =0;
		
		for(int i=0; i<n; i++)
		{
			sum+= arr[i]*arr1[i];
		}

		System.out.println(sum);
	}

}

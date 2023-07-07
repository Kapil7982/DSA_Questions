package common_dsa_questions;

public class SumLessThanEqualToK {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		//int k = 2;
		
		int k = 4;
		
		int n = arr.length;
		
		int sum=0;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] <=k ) 
			{
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}

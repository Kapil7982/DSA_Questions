package common_dsa_questions;

public class BestTimeToBuyAndSellStockII {
	
	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		
		int n = arr.length;
		
		int max =0;
		
		for(int i=1; i<n; i++)
		{
			if(arr[i] > arr[i-1])
			{
				max += arr[i] - arr[i-1];
			}
		}
		
		System.out.println(max);
	}

}

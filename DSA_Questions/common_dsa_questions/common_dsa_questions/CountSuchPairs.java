package common_dsa_questions;

public class CountSuchPairs {

	public static void main(String[] args) {
		
		
		int[] arr = {3,0,6,2,7};
		
		int k = 9;
		
		int n = arr.length;
		
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i; j<n; j++)
			{
				if(arr[i]+arr[j] == k)
				{
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}

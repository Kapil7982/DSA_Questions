package common_dsa_questions;

public class OddArraySum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		int sum=0;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] %2 !=0)
			{
				sum+= arr[i];
			}
		}
		System.out.println(sum);
	}

}

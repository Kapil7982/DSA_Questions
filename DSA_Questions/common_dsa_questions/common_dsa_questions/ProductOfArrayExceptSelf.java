package common_dsa_questions;

public class ProductOfArrayExceptSelf {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int n = arr.length;
		
		int[] result = productExceptSelf(arr,n);
		
		for(int num : result) 
		{
            System.out.print(num + " ");
        }	
	}

	private static int[] productExceptSelf(int[] arr, int n) {
		
		int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] =1;
        for(int i=1; i<n; i++)
        {
           prefix[i] = prefix[i-1] * arr[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2; i>=0; i--)
        {
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        int[] answer = new int[n];
        for(int i=0; i<n; i++)
        {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
		
	}

}

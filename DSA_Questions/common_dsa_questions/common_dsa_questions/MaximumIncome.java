package common_dsa_questions;

import java.util.Arrays;

public class MaximumIncome {

	public static void main(String[] args) {
		
		//int[] arr = {-1, -1, 1};
		
		int[] arr = {7,6,-2,1};
		
		int n = arr.length;
		
		//int k = 2;
		
		int k =7;
		
		System.out.println(maximumIncome(n,k,arr));

		
	}

	private static int maximumIncome(int n, int k, int[] arr) {
		
        Arrays.sort(arr);
        
        int total = 0;

        for(int i=0; i<n; i++) 
        {
            if(k > 0 && arr[i] < 0) 
            {
                arr[i] = -arr[i];
                k--;
            } 
            total+= arr[i];
        }

        
        if(k % 2 == 1) 
        {
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) 
            {
                min = Math.min(min, arr[i]);
            }
            total -= 2 * min;
        }

        return total;

	}

	

}

package common_dsa_questions;

import java.util.Arrays;

public class MaximizeIncome {

	public static void main(String[] args) {
	
		int[] arr = {-1, -1, 1};
		
		int n = arr.length;
		
		int k  =2;
		
		System.out.println(maximizeIncome(arr, n, k));

	}

	private static int maximizeIncome(int[] arr, int n, int k) {
		
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

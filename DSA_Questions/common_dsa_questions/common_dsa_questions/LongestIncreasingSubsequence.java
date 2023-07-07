package common_dsa_questions;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		
		int[] arr = {8,6,7,4,10,8};
		
		int n = arr.length;
		
        int[] arr1 = new int[n + 1];
        
        Arrays.fill(arr1,1);
        
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                if (arr[j] > arr[i]) arr1[j] = Math.max(arr1[i] + 1, arr1[j]);
            }
        }
        
        int max = 0;
        for(int i=0; i<n; i++)
        {
            max = Math.max(arr1[i],max);
        }
        System.out.println(max);
	}

}

package common_dsa_questions;

import java.util.Arrays;

public class HighStockValue {

	public static void main(String[] args) {
		
		int t = 7;
		
		int b = 5;
		
		int[] arr = {6,7};

		
        Arrays.sort(arr);
        
        int max=0, check=b-1, n=arr.length;
        
        for(int i:arr)
        {
            max = Math.max(max,i-check-1);
            check = i;
        }
        max = Math.max(max,t-arr[n-1]);
        
        System.out.println(max);
		
		
	}

}

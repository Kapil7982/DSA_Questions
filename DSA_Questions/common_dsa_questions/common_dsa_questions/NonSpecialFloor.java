package common_dsa_questions;

import java.util.Arrays;

public class NonSpecialFloor {

	public static void main(String[] args) {
		
		int t = 7;
        
        int b = 5;
        
        int[] arr = {6,7};
        
        Arrays.sort(arr);
        
        int max = 0;
        
        max = Math.max(max, arr[0]-b);
        max = Math.max(max, t - arr[arr.length-1]);
        
        for(int i=1; i<arr.length; i++) 
        {
            max = Math.max(max, arr[i]-arr[i-1]-1);
        }
        System.out.println(max);
	}
}

package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class MaximumValue {

	public static void main(String[] args) {
		
//		int[] arr = {1,1,1,1,1};
		
		int[] arr = {2,1,2,1,1};
		
		int n = arr.length;
		
		maximumValue(n,arr);
	}

	private static void maximumValue(int n, int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        
        for(int i=0; i<n; i++) 
        {
            if(map.containsKey(arr[i])) 
            {
                int diff = i - map.get(arr[i]);
                
                max = Math.max(max, diff);
                
            }
            else 
            {
                map.put(arr[i], i);
            }
        }
        System.out.println(max);
	}
}

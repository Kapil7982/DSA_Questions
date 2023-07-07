package common_dsa_questions;

import java.util.*;


public class SumNegligible {

	public static void main(String[] args) {
		
		int[] arr = {1,2,-2,4,-4};
		
		int n = arr.length;
		
		int max = 0;
        int sum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) 
        {
            sum += arr[i];
            
            if(sum == 0) 
            {
                max = i + 1;
            }
            else if(map.containsKey(sum)) 
            {
                max = Math.max(max, i - map.get(sum));
            } 
            else 
            {
                map.put(sum, i);
            }
        }
        
        System.out.println(max); 
	}
}

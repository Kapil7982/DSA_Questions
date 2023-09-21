package common_dsa_questions;

import java.util.*;

public class LargestX {

	public static void main(String[] args) {
	
//		int[] arr = {2,1,-1,-2, 3};
//		
//		int n = arr.length;
		
        int[] arr = {-3, 2, -4, 4, -2};
		
		int n = arr.length;

		System.out.println(largestX(arr));
	}

	private static int largestX(int[] arr) {
		
        HashSet<Integer> set = new HashSet<>();
        
        int largestX = Integer.MIN_VALUE;
        
        for(int num : arr) 
        {
            if(set.contains(-num))
            {
                largestX = Math.max(largestX, Math.abs(num));
            }
            set.add(num);
        }
        
        return largestX == Integer.MIN_VALUE ? -1 : largestX;
	}

}

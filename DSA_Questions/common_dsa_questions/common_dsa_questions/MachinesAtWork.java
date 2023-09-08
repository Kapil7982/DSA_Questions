package common_dsa_questions;

import java.util.*;

public class MachinesAtWork {

	public static void main(String[] args) {
		
		int n = 2;
		
		int t = 5;
		
		int[] arr = {2,3};
		
		System.out.println(machinesAtWork(n, t, arr));

	}

	private static int machinesAtWork(int n, int t, int[] arr) {
		
        Arrays.sort(arr);
        
        int left = 0;
        
        int right = arr[n-1] * t;
        
        while(left < right)
        {
            int mid = (left + right) / 2;
            
            int count = 0;
            
            for(int i=0; i<n; i++) 
            {
                count += mid / arr[i];
            }
            
            if(count < t) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid;
            }
        }
        
        return left;
	}

}

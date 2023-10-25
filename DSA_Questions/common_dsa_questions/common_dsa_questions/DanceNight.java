package common_dsa_questions;

import java.util.*;


public class DanceNight {

	public static void main(String[] args) {
		
		
		int m = 4;
		int n = 5;
		int[] arr = {2, 5, 6, 8};
		int[] arr1 = {3, 8, 5, 1, 7};
		
		Arrays.sort(arr); 
        Arrays.sort(arr1); 
        int i = 0; 
        int j = 0; 
        while(i<m && j<n) 
        {
            if (arr[j] >= arr1[i])
            { 
                i++; 
            }
            j++; 
        }
        if(i == m) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
	}

}

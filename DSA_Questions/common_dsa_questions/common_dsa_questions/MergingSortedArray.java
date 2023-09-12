package common_dsa_questions;

import java.util.*;

public class MergingSortedArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2};
		
		int n = arr1.length;
		
		int[] arr2 = {3,2,1};
		
		int m = arr2.length;
		
		mergingSortedArray(arr1, arr2, n, m);
	}

	private static void mergingSortedArray(int[] arr1, int[] arr2, int n, int m) {
		
		int[] merged = new int[n + m];

        System.arraycopy(arr1, 0, merged, 0, n);
        System.arraycopy(arr2, 0, merged, n, m);

        Arrays.sort(merged);

        System.out.println(n + m);
        
        for(int num : merged) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
	}

}

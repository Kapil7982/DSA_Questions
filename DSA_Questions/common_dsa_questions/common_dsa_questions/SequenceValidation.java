package common_dsa_questions;

import java.util.Arrays;
import java.util.Stack;

public class SequenceValidation {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5};
//		
//		int[] arr1 = {4,5,3,2,1};
		
		int[] arr = {1,2,3,4,5};
		
		int[] arr1 = {4,3,5,1,2};
		
		
		int n = arr.length;
		
		sequenceValidation(n,arr,arr1);
		
		

	}

	private static void sequenceValidation(int n, int[] arr, int[] arr1) {
		
		int j = 0;
		
		Stack<Integer> stc = new Stack<Integer>();
		
		for(int i=0; i<n; i++) 
		{
		    stc.push(arr[i]);
		    
		    while(!stc.empty() && j < n && stc.peek() == arr1[j])
		    {
		        stc.pop();
		        j++;
		    }
		}
		if(j == n) 
		{
		    System.out.println(1);
		} 
		else 
		{
		    System.out.println(0);
		}


		
	}

}

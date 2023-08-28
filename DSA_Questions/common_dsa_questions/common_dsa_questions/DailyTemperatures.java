package common_dsa_questions;

import java.util.Stack;

public class DailyTemperatures {

	public static void main(String[] args) {
		
	
		
//		int[] arr = {30, 40, 50, 60};
//		
//		int n = arr.length;
		
		int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
		
		int n = arr.length;
		
		int[] mat = new int [n];
		
		Stack<Integer> stc = new Stack<>();
		
		for(int i=n-1; i>-1; i--)
		{
			while(!stc.isEmpty() && arr[stc.peek()] <= arr[i])
				stc.pop();
				mat[i] = stc.isEmpty() ? 0 : stc.peek() -i;
				
				stc.push(i);
			
		}
		
		for(int i=0; i<mat.length; i++)
		{
			System.out.print(mat[i]+" ");
		}
		System.out.println();
		
		
		
		


	}

}

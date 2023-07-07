package common_dsa_questions;

import java.util.Stack;

public class SmallNeighbourElement {

	public static void main(String[] args) {
		
		int[] arr = {39,27,11,4,24,32,32,1};
		
		int n = arr.length;
		
		Stack<Integer> stc = new Stack<>();
		
		for(int i=0; i<n; i++)
		{
			while(!stc.empty() && stc.peek() >= arr[i])
			{
				stc.pop();
			}
			if(stc.empty())
			{
				System.out.print("-1"+" ");
			}
			else
			{
				System.out.print(stc.peek()+" ");
			}
			stc.push(arr[i]);
		}
	}

}

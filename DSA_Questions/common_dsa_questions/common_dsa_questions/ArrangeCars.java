package common_dsa_questions;

import java.util.Stack;

public class ArrangeCars {

	public static void main(String[] args) {
		
		int[] arr = {5,1,2,4,3};
		
		int n = arr.length;
		
		if(arrangeCars(n,arr))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	private static boolean arrangeCars(int n, int[] arr) {
		
		 Stack<Integer> st = new Stack<Integer>();
	        
	        int c = 1;

	        for(int i=0; i<n; i++) 
	        {
	            int l = arr[i];

	            while(!st.isEmpty() && st.peek() == c) 
	            {
	                st.pop();
	                c++;
	            }

	            if(l == c) 
	            {
	                c++;
	            } 
	            else if (!st.isEmpty() && st.peek() < l) 
	            {
	                return false;
	            } 
	            else 
	            {
	                st.push(l);
	            }
	        }

	        while(!st.isEmpty() && st.peek() == c) 
	        {
	            st.pop();
	            c++;
	        }

	        return st.isEmpty();
		
	}
}

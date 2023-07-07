package common_dsa_questions;

import java.util.*;

public class SignalsCapacity {

	public static void main(String[] args) {
		
		//int[] arr = {100,80,60,70,60,75,85};
		
		int[] arr = {3,5,0,9,8};
		
		
		
		int n = arr.length;
		
		Stack<Integer> stc = new Stack<>();
        StringBuilder bag = new StringBuilder();

        for (int i=0; i<n; i++) 
        {
            int tag = i;
            while(!stc.empty() && arr[stc.peek()] <= arr[i])
            {
                stc.pop();
            }
            if(!stc.empty()) 
            {
                bag.append(i - stc.peek()).append(" ");
            } 
            else 
            {
                bag.append(i + 1).append(" ");
            }

            stc.push(tag);
        }

        System.out.println(bag.toString());
	}

}

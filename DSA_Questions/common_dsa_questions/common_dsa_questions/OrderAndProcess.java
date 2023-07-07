package common_dsa_questions;

import java.util.*;

public class OrderAndProcess {

	public static void main(String[] args) {
		
		int[] arr = {3,2,1};
		
		int[] arr1 = {1,3,2};
		
		int n = arr.length;
		
		int count =0;
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i : arr)
		{
			que.add(i);
		}
		
		for(int i=0; i<n; i++)
		{
			if(que.peek() != arr1[i])
			{
				int temp = que.remove();
				que.add(temp);
				i--;
			}
			else
			{
				que.remove();
			}
			count++;
		}
		System.out.println(count);

	}

}

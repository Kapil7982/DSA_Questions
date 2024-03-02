package common_dsa_questions;

public class MonotonicArray {
	
	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5};
		
		//int[] arr = {6,5,4,3,2,1};
		
		int[] arr = {1,5,4,0};
		
		boolean increase = true;
		
		boolean decrease = true;
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] < arr[i+1])
			{
				decrease = false;
			}
			else if(arr[i] > arr[i+1])
			{
				increase = false;
			}
		}
		
		System.out.println(increase || decrease);
	}

}

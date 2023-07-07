package common_dsa_questions;

public class SelectionSortProblem {

	public static void main(String[] args) {
		
		int[] arr = {3,5,0,9,8};
		
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			int min =i;
			
			for(int j=i+1; j<n; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
			}swap(arr,min,i);
		}
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		

	}

	private static void swap(int[] arr, int j, int i) {
		
		int temp = arr[i];
	    arr[i]=arr[j];
	    arr[j] = temp;
	}

}

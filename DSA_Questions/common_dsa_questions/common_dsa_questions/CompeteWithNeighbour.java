package common_dsa_questions;

public class CompeteWithNeighbour {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 2, 1, 6, 5};
		
		int n = arr.length;
		
		int count=0;
	    for(int i=0; i<n; i++)
	    {
	        if (i == 0)
	        {
	         if (arr[i]>arr[i+1])
	         {
	             count++;
	         }
	        }
	     else if(i==n-1)
	     {
	         if (arr[i] > arr[i-1]) 
	         {
	             count++;
	         }
	     }
	     else 
	     {
	         if (arr[i]>arr[i+1] && arr[i] > arr[i-1]) 
	         {
	             count++;
	         }
	     }
	    }
	     
	     System.out.println(count);

	}

}

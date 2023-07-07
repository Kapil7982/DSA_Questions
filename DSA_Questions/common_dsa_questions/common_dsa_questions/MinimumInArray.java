package common_dsa_questions;

public class MinimumInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		int min=10000000;
		
	    for(var i=0; i<n; i++)
	    {
	        if(min>arr[i])
	        {
	            min = arr[i];
	        }
	    }
	    System.out.println(min);

	}

}

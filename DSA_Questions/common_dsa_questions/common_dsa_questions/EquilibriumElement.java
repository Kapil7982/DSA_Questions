package common_dsa_questions;

public class EquilibriumElement {

	public static void main(String[] args) {
		
		int[] arr = {3,3,5,5,1};
		
		int n = arr.length;
		
		System.out.println(equilibriumElement(n, arr));

	}

	private static int equilibriumElement(int n, int[] arr) {
		
		int left, right;

	    for (int i=0; i<n; ++i) 
	    {
	        left = 0;
	        for (int j=0; j<i; j++) 
	        {
	            left = left + arr[j];
	        }
	        right = 0;
	        for (int j=i+1; j<n; j++) 
	        {
	            right = right + arr[j];
	        }

	        if (left == right) 
	        {
	            return i +1;
	        }
	    }
	    return -1;
	}
	


}
